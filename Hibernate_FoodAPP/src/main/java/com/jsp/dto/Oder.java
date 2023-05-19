package com.jsp.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Oder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private int quantity;
	private double price;
	@CreationTimestamp
	private LocalDateTime oderTime;
	@UpdateTimestamp
	private LocalDateTime delivaryTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDateTime getOderTime() {
		return oderTime;
	}
	public void setOderTime(LocalDateTime oderTime) {
		this.oderTime = oderTime;
	}
	public LocalDateTime getDelivaryTime() {
		return delivaryTime;
	}
	public void setDelivaryTime(LocalDateTime delivaryTime) {
		this.delivaryTime = delivaryTime;
	}
	
	

}
