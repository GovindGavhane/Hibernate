package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SimCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String SP;
	@ManyToOne
	@JoinColumn(name="phone_id")
	private SmartPhone smartphone;
	

	public SmartPhone getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(SmartPhone smartphone) {
		this.smartphone = smartphone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSP() {
		return SP;
	}

	public void setSP(String sP) {
		SP = sP;
	}

}
