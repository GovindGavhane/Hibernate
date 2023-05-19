package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.MedOder;
import com.jsp.dto.User;

public class MedOderDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public MedOder saveMedOder(MedOder medoder,int user_Id)
	{
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, user_Id);
		List<MedOder> mo = user.getMedoders();
		mo.add(medoder);
		user.setMedoders(mo);
		medoder.setUser(user);
		manager.persist(medoder);
		manager.merge(user);
		transaction.commit();
		return medoder;
	}

}
