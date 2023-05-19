package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;

public class SavePeson {

	public static void main(String[] args) {


		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction trasaction = manager.getTransaction();
		 EntityManager manager2 = factory.createEntityManager();
		 
		 Person person = manager.find(Person.class, 1);
		 Person p3 = manager2.find(Person.class, 1);
		 Person p4 = manager2.find(Person.class, 2);// three query will be created 
		 Person p6 = manager.find(Person.class, 1);
		 Person p8 = manager2.find(Person.class, 2);
		 
		 
		 
		 
//		 Person person = new Person();
//		 person.setName("A");
//		 person.setAge(12);
//		 
//		 Person p2 = new Person();
//		 p2.setName("B");
//		 p2.setAge(14);
//		 trasaction.begin();
//		 manager.persist(person);
//		 manager.persist(p2);
//		 trasaction.commit();

	}

}
