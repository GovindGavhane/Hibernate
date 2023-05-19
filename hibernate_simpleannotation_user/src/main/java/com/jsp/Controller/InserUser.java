package com.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class InserUser {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		User user = new User();
		user.setName("Ramesh");
		user.setPhone(98989822L);
		user.setPassword("123@123");
		transaction.begin();
		manager.persist(user);;
		transaction.commit();
		 

	}

}
