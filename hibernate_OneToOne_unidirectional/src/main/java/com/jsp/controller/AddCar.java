package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

public class AddCar {

	public static void main(String[] args) {
		 EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction transaction = manager.getTransaction();
		 Car car = new Car();
		 car.setBrand("Lamborgini");
		 car.setColor("Black");
		 Engine engine = new Engine();
		 engine.setNoc(4);
		 engine.setCc(400);
		 car.setEngine(engine);
		 transaction.begin();
		 manager.persist(engine);
		 manager.persist(car);
		 transaction.commit();
	}

}
