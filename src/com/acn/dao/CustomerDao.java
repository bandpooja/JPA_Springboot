package com.acn.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.PersistenceProperty;
import javax.transaction.Transactional;

import org.springframework.mock.staticmock.MockStaticEntityMethods;
import org.springframework.stereotype.Component;

import com.acn.model.Customer;
@Component
public class CustomerDao {

	@PersistenceContext
	EntityManager em;
	
	

	
public EntityManager getEm() {
		return em;
	}




	public void setEm(EntityManager em) {
		this.em = em;
	}




@Transactional
public Customer insertdata(Customer c)
{
em.merge(c);
	return c;
}
}
