package com.qa.hobbyproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbyproject.model.Customer;
import com.qa.hobbyproject.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@PostMapping("/createcustomer")
	public String createCustomerRecord(@RequestBody Customer customer) {
		String message = this.service.createCustomer(customer);

		return message;
	}
	
	@GetMapping("/readallcustomers")
	public List<Customer> readAllCustomerRecords() {
		List<Customer> record = service.readAllCustomers();
		
		return record;	
	}
	
	//@PutMapping("/updatcustomer/{id}")
	
	@DeleteMapping("/deletecustomer/{id}")

public String deleteCustomer(@PathVariable int id) {
boolean deleted = this.service.deleteCustomer(id);

	String message;
	if (deleted) message = "Customer deleted";	
	else message = "Id does not exist";	
	
	return message; 
}

}
