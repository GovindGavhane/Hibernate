package com.jsp.controller;

import com.jsp.dao.EncouterDao;
import com.jsp.dto.Encouter;

public class SaveEncouter {

	public static void main(String[] args) {
		 
		EncouterDao dao = new EncouterDao();
		Encouter e = new Encouter();
		e.setReason("road acssident");
		Encouter encouter =dao.saveEncouter(e, 4);
		if(encouter!=null)
		System.out.println("Encouter saved successfully");

	}

}
