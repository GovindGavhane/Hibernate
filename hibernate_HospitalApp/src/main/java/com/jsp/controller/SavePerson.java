package com.jsp.controller;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class SavePerson {

	public static void main(String[] args) {

     PersonDao dao = new PersonDao();
     Person person = new Person();
     person.setName("Govind");
     person.setAge(23);
     person.setGender("male");
     person.setEmail("govind@gmail.com");
     person.setPhone(999000009);
     Person p=  dao.savePerson(person, 2, 4);
     if(p!=null)
     {
    	 System.out.println(" Person saved successfully");
     }
     

	}

}
