package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.SimCard;
import com.jsp.dto.SmartPhone;

public class GetSimCard {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SimCard simcard = manager.find(SimCard.class, 1);
		System.out.println(simcard);
		SmartPhone smartphone = simcard.getSmartphone();
		 
		 

	}

}
