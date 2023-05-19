package com.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Person {
	
	@EmbeddedId
	private PersonId id;
	
	private int age;
	private String name;
	private String gender;
	
	public PersonId getId() {
		return id;
	}
	public void setId(PersonId id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
