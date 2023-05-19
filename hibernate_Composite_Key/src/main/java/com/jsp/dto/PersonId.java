package com.jsp.dto;

 

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonId implements Serializable  {
	
	private long phone;
	private String gmail;
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	

}
