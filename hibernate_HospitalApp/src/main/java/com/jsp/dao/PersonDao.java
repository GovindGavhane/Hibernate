package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Branch;
import com.jsp.dto.Encouter;
import com.jsp.dto.Person;

public class PersonDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	public Person savePerson(Person person , int encouter_Id,int branch_Id)
	{
		EntityTransaction trasaction = manager.getTransaction();
		trasaction.begin();
		Branch branch =manager.find(Branch.class, branch_Id);
		List<Encouter> encouters = branch.getEncouter();
		Encouter encouter = encouters.get(0);
		person.setEncouter(encouter);
		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		branch.setPersons(personList);
		branch.setEncouter(encouters);
		person.setBranch(branch);
		manager.persist(person);
		manager.merge(branch);
		manager.merge(encouter);
		trasaction.commit();
		return person;
	}

}
