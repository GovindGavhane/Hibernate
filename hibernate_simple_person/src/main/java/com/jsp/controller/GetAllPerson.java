package com.jsp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class GetAllPerson {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Query q = manager.createQuery("select p from Person p");
		List<Person> persons = q.getResultList();
		for(Person p:persons)
		{
			 System.out.println(p.getId()+" "+p.getName()+" "+p.getPhone());

		}
	}

}
