package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;
import com.jsp.dto.PersonId;

public class SavePerson {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Person person = new Person();
		person.setName("Shama");
		person.setGender("male");
		person.setAge(23);
		
		PersonId id = new PersonId();
		id.setGmail("govind771@gmail.com");
		id.setPhone(888888888);
		
		person.setId(id);
		
		manager.persist(person);
		transaction.commit();
	}

}
