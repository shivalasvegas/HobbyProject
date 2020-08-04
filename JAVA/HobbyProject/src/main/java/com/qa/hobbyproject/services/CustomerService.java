package com.qa.hobbyproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbyproject.exceptions.CustomerNotFoundException;
import com.qa.hobbyproject.model.Customer;
import com.qa.hobbyproject.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	//Create
	public String create(Customer customer) {
		this.customerRepo.save(customer);
		return "Customer record created";
	}
	
	
	//Read
	public List<Customer> readAll() {
		List<Customer> customerRecords = this.customerRepo.findAll();
		return customerRecords;
	
	}
	

	public Customer read(int id) {
	Customer customer = this.customerRepo.findById(id).orElseThrow(CustomerNotFoundException::new);
	return customer;
}
		
	
	//Update
	public Customer update(Customer newCustomer, int id) {
	Customer updateCustomer = read(id);

	updateCustomer.setCustomerName(newCustomer.getCustomerName());
	updateCustomer.setCustomerAddress(newCustomer.getCustomerAddress());
	updateCustomer.setCustomerPhone(newCustomer.getCustomerPhone());
	updateCustomer.setCustomerEmail(newCustomer.getCustomerEmail());
	updateCustomer.setCustomerPassword(newCustomer.getCustomerPassword());

	Customer saved = this.customerRepo.save(updateCustomer);
	return saved;
}

	
	//Delete
	public boolean delete(int id) {
		this.customerRepo.deleteById(id);
		boolean deleted = !this.customerRepo.existsById(id);
		return deleted;
	}

	
	
	
	

}
