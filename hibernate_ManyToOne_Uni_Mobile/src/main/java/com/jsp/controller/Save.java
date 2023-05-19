package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.SimCard;
import com.jsp.dto.SmartPhone;

public class Save {

	public static void main(String[] args) {

       EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
       EntityManager manager = factory.createEntityManager();
       EntityTransaction transaction = manager.getTransaction();
       SmartPhone mp = new SmartPhone();
       mp.setBrand("Realme");
       mp.setRam(8);
       mp.setStorage(64);
       SimCard simcard = new SimCard();
       simcard.setServicePravider("JIO");
       simcard.setNumber(999999999);
       simcard.setType("prepaid");
       simcard.setSmartphone(mp);
       SimCard simcard1 = new SimCard();
       simcard1.setServicePravider("Arted");
       simcard1.setNumber(77777777);
       simcard1.setType("Postpaid");
       simcard1.setSmartphone(mp);
       transaction.begin();
       manager.persist(mp);
       manager.persist(simcard1);
       manager.persist(simcard);
       transaction.commit();
        

	}

}
