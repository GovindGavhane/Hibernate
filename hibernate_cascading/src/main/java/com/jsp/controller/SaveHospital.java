package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.Hospital;

public class SaveHospital {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transation = manager.getTransaction();
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setFouder("Rmakishana");
		hospital.setGst("SSSDDD345");
	
		Branch b1 = new Branch();
		b1.setName("ApolloBeed");
		b1.setFouder("Rajunana");
		b1.setEmail("apollobeed@gmail.com");
		b1.setPhone(99999999);
		
		Branch b2 = new Branch();
		b2.setName("ApolloPune");
		b2.setFouder("kurankuku");
		b2.setEmail("apollopune@gmail.com");
		b2.setPhone(888888888);
		
		Branch b3 = new Branch();
		b3.setName("ApolloMumbai");
		b3.setFouder("kumar");
		b3.setEmail("apolloMumbai@gmail.com");
		b3.setPhone(777777777);
		
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		branches.add(b3);
		
		hospital.setBranch(branches);
		b1.setHospital(hospital);
		b2.setHospital(hospital);
		b3.setHospital(hospital);
		
		transation.begin();
		manager.persist(hospital);
		transation.commit();
	}

}
