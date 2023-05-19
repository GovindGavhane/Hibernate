package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.User;

public class UserDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public User saveUser(User user,int branch_Id)
	{
		EntityTransaction trasaction = manager.getTransaction();
		trasaction.begin();
		Branch branch = manager.find(Branch.class, branch_Id);
		List<User> users = branch.getUsers();
		users.add(user);
		branch.setUsers(users);
		user.setBranch(branch);
		manager.persist(user);
		manager.merge(branch);
		trasaction.commit();
		return user;
		
		
	}
}
