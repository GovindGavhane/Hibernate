package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class SaveUser {

	public static void main(String[] args) {

     EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
     EntityManager manager = factory.createEntityManager();
     EntityTransaction trasaction = manager.getTransaction();
     
     User user = new User();
     user.setName("Majanu");
     user.setPhone(888888888);
     user.setPassword("456");
     
     trasaction.begin();
     manager.persist(user);
     trasaction.commit();

	}

}
