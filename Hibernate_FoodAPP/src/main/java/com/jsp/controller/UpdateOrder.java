package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Oder;

public class UpdateOrder {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Oder  oder = new Oder();
		oder.setAddress("gurgaon");
		oder.setPrice(270);
		oder.setQuantity(2);
		oder.setId(1);
		transaction.begin();
		manager.merge(oder);
		transaction.commit();
		
	}

}
