package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Person;

public class getPerson {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person person = manager.find(Person.class, 1);
		if(person!=null)
		{
		 System.out.println(person.getId()+" "+person.getName()+" "+person.getPhone());
		}else
		{
			System.out.println("given id person does not exist");
		}

	}

}
