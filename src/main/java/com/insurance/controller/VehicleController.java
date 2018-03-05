package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Customer;
import com.insurance.model.Vehicle;
import com.insurance.repository.CustomerRepository;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	
	@Autowired
	private CustomerRepository customerRepository;

	
	/**
     * US04
     */	
	@RequestMapping("/basePrice")
	@ResponseBody
	Float calculateBasePrice(@RequestBody Vehicle vehicle) { 
		/* #TODO Implement*/
		return new Float(0);
	}
	
	  
}
