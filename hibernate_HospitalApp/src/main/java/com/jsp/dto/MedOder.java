package com.jsp.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class MedOder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String message;
	@CreationTimestamp
	private LocalDateTime oderTime;
	@UpdateTimestamp
	private LocalDateTime delivaryTime;
	@ManyToOne
	@JoinColumn
	private User user;
	@OneToMany(mappedBy ="medoder")
	private List<Item> items;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
