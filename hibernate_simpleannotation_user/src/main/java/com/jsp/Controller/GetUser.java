package com.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.User;

public class GetUser {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		User user =  manager.find(User.class, 1);
		 if(user!=null)
		 {
			 System.out.println(user.getId()+" "+user.getName()+" "+user.getPhone()+" "+user.getPassword());
		 }
		 else
		 {
			 System.out.println("id with user not present");
		 }
	}

}
