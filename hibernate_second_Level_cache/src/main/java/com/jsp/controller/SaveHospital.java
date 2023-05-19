package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Hospital;

public class SaveHospital {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trasaction = manager.getTransaction();
		Hospital h = new Hospital();
		h.setName("Apollo");
		h.setFouder("RM");
		
		Hospital h2 = new Hospital();
		h2.setName("Sacheti");
		h2.setFouder("KK");
		
		trasaction.begin();
		manager.persist(h);
		manager.persist(h2);
		trasaction.commit();

	}

}
