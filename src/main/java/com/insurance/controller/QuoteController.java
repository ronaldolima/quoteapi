package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Customer;
import com.insurance.model.Quote;
import com.insurance.model.Vehicle;
import com.insurance.repository.CustomerRepository;
import com.insurance.repository.QuoteRepository;
import com.insurance.repository.VehicleRepository;
import com.insurance.services.QuoteService;

@RestController
@RequestMapping("/quote")
public class QuoteController {
	
	@Autowired
	private CustomerRepository customerRepository;
 
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private QuoteRepository quoteRepository;
	
	@Autowired
	private QuoteService quoteService;

	
	 /**
     * US01
     */
	@RequestMapping(path = "/create", method=RequestMethod.POST)
	@ResponseBody
	Quote startQuote(@RequestBody Customer customer, @RequestBody Vehicle vehicle) {
		
		Quote quote = new Quote();
		customer.getVehicles().add(vehicle);
		quote.setCustomer(customer);
		
		quoteService.sendQuoteMessage(quote);
		
		return quote;
	}
	 
	/**
     * US02
     */	
	@RequestMapping("/savePreQuote")
	@ResponseBody
	String savePreQuote() { 
		/* #TODO Implement*/
		return new String();
	}

	 /**
     * US06
     */
	@RequestMapping("/{quoteKey}")
	@ResponseBody
	Quote getQuote(@RequestBody Long quoteKey) {
		/* #TODO Implement*/
		return new Quote();
	}
	 
	
}
