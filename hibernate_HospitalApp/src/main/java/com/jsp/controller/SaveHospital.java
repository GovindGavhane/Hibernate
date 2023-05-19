package com.jsp.controller;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

public class SaveHospital {
	
  public static void main(String[] args) {
	
	   Hospital hospital =  new Hospital();
	   hospital.setName("Apollo");
	   hospital.setGst("SDDJ234");
	   hospital.setFouder("Chiku");
	   HospitalDao dao = new HospitalDao();
	  Hospital h = dao.saveHospital(hospital);
	  if(h!=null)
	  {
		  System.out.println("Hospital save successfully");
	  }
	   
}

}
