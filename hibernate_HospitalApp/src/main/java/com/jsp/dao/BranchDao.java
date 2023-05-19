package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Branch;
import com.jsp.dto.Hospital;

public class BranchDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();

	public Branch saveBranch(Branch branch , int hospital_Id) {
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Hospital hospital  = manager.find(Hospital.class,hospital_Id );
		if(hospital!=null)
		{
		List<Branch> branches = hospital.getBranches();
		branches.add(branch);
		branch.setHospital(hospital);
		manager.persist(branch);
		manager.merge(hospital);
		transaction.commit();
		return branch;
		}
		return null;

	}
	
	 

	public Branch updateBranch(Branch branch) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(branch);
		transaction.commit();
		return branch;
	}

	public Branch getBranch(int id) {
		EntityTransaction transaction = manager.getTransaction();
		Branch branch = manager.find(Branch.class, id);
		return branch;
	}

	public boolean removeBranch(int id) {
		EntityTransaction transaction = manager.getTransaction();
		Branch branch = getBranch(id);
		if (branch != null) {
			transaction.begin();
			manager.remove(branch);
			transaction.commit();
			return true;
		}
		return false;
	}

	public List<Branch> getAllBranch() {
		EntityTransaction transaction = manager.getTransaction();
		Query q = manager.createQuery("select m from Branch m");
		List<Branch> branches = q.getResultList();
		return branches;
	}

}
