package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.SimCard;
import com.jsp.dto.SmartPhone;

public class SaveSmartPhone {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		SmartPhone smartphone = new SmartPhone();
		smartphone.setBrand("Realme");

		SimCard simcard1 = new SimCard();
		simcard1.setSP("JIO");

		SimCard simcard2 = new SimCard();
		simcard2.setSP("Arted");

		SimCard simcard3 = new SimCard();
		simcard3.setSP("Idea");

		List<SimCard> sim = new ArrayList<SimCard>();
		sim.add(simcard1);
		sim.add(simcard2);
		sim.add(simcard3);

		smartphone.setSimcard(sim);

		simcard1.setSmartphone(smartphone);
		simcard2.setSmartphone(smartphone);
		simcard3.setSmartphone(smartphone);

		transaction.begin();
		manager.persist(smartphone);
		manager.persist(simcard1);
		manager.persist(simcard2);
		manager.persist(simcard3);
		transaction.commit();

	}

}
