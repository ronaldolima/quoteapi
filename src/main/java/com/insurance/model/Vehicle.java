package com.insurance.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.insurance.domain.VehicleTypeEnum;


@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id; 
	
    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 10)
	private VehicleTypeEnum type;
    
    @Column(name = "year")
    private Integer year;
    
    @Column(name = "model", length = 100)
    private String model;
    
    @Column(name = "make")
	private Integer make;
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ssn_owner", nullable = false)
	@NotNull
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehicleTypeEnum getType() {
		return type;
	}

	public void setType(VehicleTypeEnum type) {
		this.type = type;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getMake() {
		return make;
	}

	public void setMake(Integer make) {
		this.make = make;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
