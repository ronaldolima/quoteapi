package com.insurance.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name = "ssn", unique = true, nullable = false)
	private Integer ssn;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "gender", length = 1)
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birth")
	private Date birth;
	
	@Column(name = "address", length = 250)
	private String address;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "phone", length = 15)
	private String phone;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Vehicle> vehicles;

	
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
}
