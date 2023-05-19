package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;

public class DeletePerson {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person person = new Person();
		person.setId(2);
		Person person2 = manager.find(Person.class, person.getId());
		if(person2!=null)
		{
		transaction.begin();
		manager.remove(person2);
		transaction.commit();
		}
		else
		{
			System.out.println("given id person does not exist");
		}

	}

}
