package com.jsp.controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Oder;

public class SaveOrder {

	public static void main(String[] args) {
	 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trasaction = manager.getTransaction();
		Oder oder = new Oder();
		oder.setAddress("pune");
		oder.setPrice(250);
		oder.setQuantity(3);
//        oder.setDelivaryTime(LocalDateTime.now());	
//        oder.setOderTime(LocalDateTime.now());
        trasaction.begin();
        manager.persist(oder);
        trasaction.commit();

	}

}
