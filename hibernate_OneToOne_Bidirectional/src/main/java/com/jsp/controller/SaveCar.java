package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

public class SaveCar {

	public static void main(String[] args) {
		 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trasaction = manager.getTransaction();
		
		Car car1 = new Car();
		car1.setBrand("Lamborgini");
		car1.setPrice(2222222222D);
		
		Car car2 = new Car();
		car2.setBrand("ODDy");
		car2.setPrice(44444444);
		
		Engine engine1 = new Engine();
		engine1.setNoc(4);
		engine1.setCc(400);
		
		Engine engine2 = new Engine();
		engine2.setNoc(5);
		engine2.setCc(500);
		
		car1.setEngine(engine1);
		car2.setEngine(engine2);
		engine1.setCar(car1);
		engine2.setCar(car2);
		
		trasaction.begin();
		manager.persist(engine1);
		manager.persist(engine2);
		manager.persist(car1);
		manager.persist(car2);
		trasaction.commit();
		 

	}

}
