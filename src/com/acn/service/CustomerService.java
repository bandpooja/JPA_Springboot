
package com.acn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acn.dao.CustomerDao;
import com.acn.model.Customer;
@Component
public class CustomerService {
	
	@Autowired
	CustomerDao dao;

	public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	public boolean setdata(Customer c1)
	{
		
		Customer c=dao.insertdata(c1);
		if(c==null)
			return false;
		return true;
	}

}
