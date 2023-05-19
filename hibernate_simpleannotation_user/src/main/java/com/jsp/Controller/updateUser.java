package com.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class updateUser {

	public static void main(String[] args) {
		 
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	User user = new User();
	user.setId(3);
	user.setName("aavu");
	user.setPhone(98981111L);
	user.setPassword("avu@123");
	transaction.begin();
	manager.merge(user);
	transaction.commit();
	}
}
