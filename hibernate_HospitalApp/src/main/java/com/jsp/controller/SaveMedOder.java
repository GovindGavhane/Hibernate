package com.jsp.controller;

import com.jsp.dao.MedOderDao;
import com.jsp.dto.MedOder;

public class SaveMedOder {

	public static void main(String[] args) {

     MedOderDao dao = new MedOderDao();
     MedOder medoder = new MedOder();
     medoder.setMessage("i am doctor i need serson matrial");
        MedOder m = dao.saveMedOder(medoder, 1);
        if(m!=null)
        {
        	System.out.println(" Med Oder saved Successfully");
        }
     

	}

}
