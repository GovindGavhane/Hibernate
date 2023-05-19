package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;

public class InsertPerson {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person person = new Person();
		person.setId(3);
		person.setName("Komal");
		person.setPhone(777777777L);
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
	}
	

}
