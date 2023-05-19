package com.jsp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.Hospital;

public class GetHospital {

	public static void main(String[] args) {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		 EntityManager manager=factory.createEntityManager();
		 EntityTransaction transaction = manager.getTransaction();
		 Hospital hospital = manager.find(Hospital.class, 1);
		 System.out.println(hospital.getId());
		 System.out.println(hospital.getName());
		 System.out.println(hospital.getFounder());
		 System.out.println(hospital.getGst());
		 List<Branch> b = hospital.getBranches();
		 for(Branch branch:b)
		 {
			 System.out.println(branch.getId()+" "+branch.getName()+" "+branch.getEmail()+" "+branch.getPhone());
		 }

	}

}
