package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="quote")
public class Quote {
	
	@Id
	@Column(name = "key", unique = true, nullable = false)
	private Long key;
	
	@Column(name = "price")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	
	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




}
