package com.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class DeleteUser {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		User user =  manager.find(User.class, 3);
		if(user!=null)
		{
		transaction.begin();
		manager.remove(user);;
		transaction.commit();
		}else
		{
			System.out.println("existing id not found");
		}

	}

}
