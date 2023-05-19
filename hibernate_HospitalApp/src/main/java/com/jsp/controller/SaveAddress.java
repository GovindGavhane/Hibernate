package com.jsp.controller;

import com.jsp.dao.AddressDao;
import com.jsp.dto.Address;

public class SaveAddress {
	
	public static void main(String[] args) {
		
		AddressDao dao = new AddressDao();
		Address address = new Address();
		address.setState("Maharashtra");
		address.setCity("beed");
		address.setPincode(431122);
	    Address a=	dao.saveAddress(address, 5);
	    if(a!=null)
	    {
	    	System.out.println("Address Save sucessfully");
	    }
		
	}

}
