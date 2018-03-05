package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Customer;
import com.insurance.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerRepository customerRepository;

	
	/**
     * US03
     */	
	@RequestMapping("/modifier")
	@ResponseBody
	Float calculateModifier(@RequestBody Customer customer) {
		/* #TODO Implement*/
		return new Float(0);
	}
	
	
	  
}
