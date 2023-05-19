package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Hospital;

public class HospitalDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();

	public Hospital saveHospital(Hospital hospital) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(hospital);
		transaction.commit();
		return hospital;
	}

	public Hospital updateHospital(Hospital hospital) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(hospital);
		transaction.commit();
		return hospital;
	}

	public Hospital getHospital(int id) {
		EntityTransaction transaction = manager.getTransaction();
		Hospital hospital = manager.find(Hospital.class, id);
		if (hospital != null) {
			System.out.println(
					hospital.getId() + " " + hospital.getFouder() + " " + hospital.getName() + " " + hospital.getGst());
			;
			return hospital;
		} else {
			System.out.println(" hospital is empty");
			return null;
		}

	}

	public boolean removeHospital(int id) {
		EntityTransaction transaction = manager.getTransaction();
		Hospital hospital = getHospital(id);
		if (hospital != null) {
			transaction.begin();
			manager.remove(hospital);
			transaction.commit();
			return true;
		} else {
			System.out.println("this id with hospital not present please enter the valid id");
			return false;
		}
	}

	public List<Hospital> getAllHospital() {
		EntityTransaction transaction = manager.getTransaction();
         Query q = manager.createQuery("select h from Hospital h");
         List<Hospital> hospitalList = q.getResultList();
         if(hospitalList.size()>0)
         {
        	 for(Hospital h: hospitalList)
        		 System.out.println(h.getId()+" "+h.getName()+" "+h.getFouder()+" "+h.getGst());
        	 
         }
         
		return hospitalList;
	}
	
	 
	 

}
