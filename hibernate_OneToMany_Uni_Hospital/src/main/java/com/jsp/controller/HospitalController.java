package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.Hospital;

public class HospitalController {

	public static void main(String[] args) {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		 EntityManager manager=factory.createEntityManager();
		 EntityTransaction transaction = manager.getTransaction();
		 Hospital hospital = new Hospital();
		 hospital.setName("Apolla");
		 hospital.setFounder("Rushikesh");
		 hospital.setGst("DDSDSFF77676767");
		 Branch branch1 = new Branch();
		 branch1.setName("Pune");
		 branch1.setEmail("pune@gmail.com");
		 branch1.setPhone(909090909);
		 Branch branch2 = new Branch();
		 branch2.setName("Mumbai");
		 branch2.setEmail("mumbai@gmail.com");
		 branch2.setPhone(88888888);
		 Branch branch3 = new Branch();
		 branch3.setName("bangolare");
		 branch3.setEmail("bangolare@gmail.com");
		 branch3.setPhone(77777777);
		 List<Branch> Bl = new ArrayList<Branch>();
		 Bl.add(branch1);
		 Bl.add(branch2);
		 Bl.add(branch3);
		 hospital.setBranches(Bl);
		 transaction.begin();
		 manager.persist(hospital);
		 manager.persist(branch1);
		 manager.persist(branch2);
		 manager.persist(branch3);
		 transaction.commit();
         
		 
	}

}
