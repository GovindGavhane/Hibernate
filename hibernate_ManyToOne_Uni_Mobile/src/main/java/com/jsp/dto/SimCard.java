package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SimCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String servicePravider;
	private String type;
	private long number;
	@ManyToOne
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
	public String getServicePravider() {
		return servicePravider;
	}
	public void setServicePravider(String servicePravider) {
		this.servicePravider = servicePravider;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	

}
