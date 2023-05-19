package com.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class UserLogin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone and password");
		 long phone = sc.nextLong();
		 String pass = sc.next();
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction trasaction = manager.getTransaction();
		 String q = "select u from User u where u.phone=?1 and u.password=?2";
		 Query qu = manager.createQuery(q);
		 qu.setParameter(1,phone);
		 qu.setParameter(2, pass);
		 List<User> users = qu.getResultList();
		 if(users.size()>0)
		 {
			 System.out.println("user login sucessfully");
			 User user = users.get(0);
			 System.out.println(user.getId()+" "+user.getName()+" "+user.getPassword()+" "+user.getPhone());
			 
		 }
		 else
		 {
			 System.out.println(" Invalid username and password");
		 }

	}

}
