package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.PAN;
import com.jsp.dto.Person;

public class SavePerson {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trasaction = manager.getTransaction();
		Person person = new Person();
		person.setName("Shama");
		person.setAge(22);
		person.setGender("male");
		
		PAN pan = new PAN();
		pan.setCountry("india");
		pan.setPhone(999999999);
		pan.setNumber("DDBJ6768");
		
		person.setPan(pan);
		pan.setPerson(person);
		
		trasaction.begin();
		manager.persist(pan);
		manager.persist(person);
		trasaction.commit();

	}

}
