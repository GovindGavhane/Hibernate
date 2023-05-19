package com.jsp.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class GetAllUser {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
        Query q = manager.createQuery("select u from User u");
        List<User> users = q.getResultList();
		 for(User user : users)
		 {
			 System.out.println(user.getId()+" "+user.getName()+" "+user.getPhone()+" "+user.getPassword());
		 }
		 
	}

}
