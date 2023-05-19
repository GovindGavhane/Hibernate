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
   Car car = new Car();
   car.setBrand("Lamborgini");
   
   Engine engine = new Engine();
   engine.setNci(4);
   
   car.setEngine(engine);
   engine.setCar(car);
   
   trasaction.begin();
   manager.persist(engine);
   manager.persist(car);
   trasaction.commit();

	}

}
