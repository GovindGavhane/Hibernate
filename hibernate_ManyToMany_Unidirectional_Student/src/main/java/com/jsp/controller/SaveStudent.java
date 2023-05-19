package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Course;
import com.jsp.dto.Student;

public class SaveStudent {

	public static void main(String[] args) {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		 EntityManager manager = factory.createEntityManager();
		 EntityTransaction trasaction = manager.getTransaction();
		 Student s1 = new Student();
		 s1.setName("Ram");
		 s1.setAge(22);
		 
		 Student s2 = new Student();
		 s2.setName("Shama");
		 s2.setAge(23);
		 
		 Course course1 = new Course();
		 course1.setSubject("JAVA");
		 course1.setDuration("50 Hourse");
		 
		 Course course2 = new Course();
		 course2.setSubject("SQL");
		 course2.setDuration("20 Hourse");
		 
		 Course course3 = new Course();
		 course3.setSubject("Pythan");
		 course3.setDuration("40 Hourse");
		 
		 List<Course> forStudent1 = new ArrayList<Course>();
		 forStudent1.add(course1);
		 forStudent1.add(course3);
		 
		 List<Course> forStudent2 = new ArrayList<Course>();
		 forStudent2.add(course1);
		 forStudent2.add(course2);
		 forStudent2.add(course3);
		 
		 s1.setCourses(forStudent1);
		 s2.setCourses(forStudent2);
		 
		 trasaction.begin();
		 manager.persist(course1);
		 manager.persist(course2);
		 manager.persist(course3);
		 manager.persist(s1);
		 manager.persist(s2);
		 trasaction.commit();
		 
		 
		 

	}

}
