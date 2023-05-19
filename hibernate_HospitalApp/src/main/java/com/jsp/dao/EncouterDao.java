package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.Encouter;

public class EncouterDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public Encouter saveEncouter(Encouter e, int branch_Id)
	{
		EntityTransaction trasaction = manager.getTransaction();
		trasaction.begin();
		Branch branch = manager.find(Branch.class,branch_Id );
		e.setBranch(branch);
		List<Encouter> encouters = branch.getEncouter();
		encouters.add(e);
		branch.setEncouter(encouters);
		manager.persist(e);
		manager.merge(branch);
		trasaction.commit();
		return e;
	}
}
