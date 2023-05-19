package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.dto.Hospital;

public class GetHospital {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Hospital h1 = manager.find(Hospital.class, 1);
		Hospital h2 = manager.find(Hospital.class, 1);
		Hospital h3 = manager.find(Hospital.class, 2);
		
		EntityManager manager1 = factory.createEntityManager();
		Hospital h4 = manager1.find(Hospital.class, 1);


	}

}
