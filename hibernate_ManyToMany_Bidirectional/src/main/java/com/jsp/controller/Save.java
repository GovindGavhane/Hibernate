package com.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Course;
import com.jsp.dto.Student;

public class Save {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trasaction = manager.getTransaction();

		Student student1 = new Student();
		student1.setName("Ram");
		student1.setPhone(99999999);
		student1.setAge(22);

		Student student2 = new Student();
		student2.setName("Sham");
		student2.setPhone(888888888);
		student2.setAge(23);

		Course course1 = new Course();
		course1.setSubject("Java");
		course1.setDuration("60 Hourse");

		Course course2 = new Course();
		course2.setSubject("SQL");
		course2.setDuration("20 Hourse");

		Course course3 = new Course();
		course3.setSubject("Python");
		course3.setDuration("40 Hourse");

		List<Course> courseforStudent1 = new ArrayList<Course>();
		courseforStudent1.add(course1);
		courseforStudent1.add(course3);

		List<Course> courseforStudent2 = new ArrayList<Course>();
		courseforStudent2.add(course1);
		courseforStudent2.add(course2);
		courseforStudent2.add(course3);

		student1.setCouses(courseforStudent1);
		student2.setCouses(courseforStudent2);

		List<Student> studentForCourse1 = new ArrayList<Student>();
		studentForCourse1.add(student1);
		studentForCourse1.add(student2);

		List<Student> studentForCourse2 = new ArrayList<Student>();
		studentForCourse2.add(student1);

		List<Student> studentForCourse3 = new ArrayList<Student>();
		studentForCourse3.add(student1);
		studentForCourse3.add(student2);

		course1.setStudent(studentForCourse1);
		course2.setStudent(studentForCourse2);
		course2.setStudent(studentForCourse3);

		trasaction.begin();
		manager.persist(student1);
		manager.persist(student2);
		manager.persist(course1);
		manager.persist(course2);
		manager.persist(course3);
		trasaction.commit();

	}

}
