package com.jsp.controller;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class SaveUser {

	public static void main(String[] args) {
		 
		UserDao dao = new UserDao();
		User user = new User();
		user.setName("Rama");
		user.setRole("Doctor");
		user.setEmail("rama@gmail.com");
		user.setPhone(777888999);
		user.setPassword("rama@123");
		User u =dao.saveUser(user, 4);
		if(u!=null)
		{
			System.out.println("user saved successfully");
		}
		

	}

}
