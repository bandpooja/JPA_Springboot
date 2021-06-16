package com.acn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acn.model.Customer;
import com.acn.service.CustomerService;
@Controller
public class CustomerController {
	
	
	@Autowired
	CustomerService ser;
	
	
	public CustomerService getSer() {
		return ser;
	}

	public void setSer(CustomerService ser) {
		this.ser = ser;
	}
@RequestMapping("add.htm")
	public ModelAndView viewdetails(HttpServletRequest req,HttpServletResponse res)
	{
		ModelAndView mv=new ModelAndView();
		Customer c=new Customer();
		c.setName(req.getParameter("name"));
		c.setCity(req.getParameter("city"));
		
	boolean result=ser.setdata(c);
	if(result)
	{
		mv.addObject("cus",c);
	mv.setViewName("sucess.jsp");
	return mv;
	}
		
	else
		mv.setViewName("fail.jsp");
		
		
		
		
		return mv;
		
		
		
		
	}
	
	

}
