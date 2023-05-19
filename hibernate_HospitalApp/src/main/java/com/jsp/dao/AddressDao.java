package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Address;
import com.jsp.dto.Branch;

public class AddressDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public Address saveAddress(Address a , int branch_Id)
	{
		EntityTransaction transaction = manager.getTransaction();
		Branch branch = manager.find(Branch.class, branch_Id);
		a.setBranch(branch);
	   transaction.begin();
	   manager.persist(a);
	   manager.merge(branch);
	   transaction.commit();
	   return a;
		

	}

}
