package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

public class GetCar {

	public static void main(String[] args) {

     EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
     EntityManager manager = factory.createEntityManager();
     EntityTransaction transaction = manager.getTransaction();
     Car car=  manager.find(Car.class, 1);
     Engine engine = car.getEngine();
     System.out.println(car.getId()+" "+car.getBrand());
     System.out.println(engine.getId()+" "+engine.getNci());
	}

}
