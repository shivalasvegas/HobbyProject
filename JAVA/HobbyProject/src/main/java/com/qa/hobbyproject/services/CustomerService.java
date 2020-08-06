package com.qa.hobbyproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbyproject.exceptions.IdNotFoundException;
import com.qa.hobbyproject.model.Customer;
import com.qa.hobbyproject.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	//Create
	public String createCustomer(Customer customer) {
		this.customerRepo.save(customer);
		return "Customer record created";
	}
	
	
	//Read
	public List<Customer> readAllCustomers() {
		List<Customer> customerRecords = this.customerRepo.findAll();
		return customerRecords;
	
	}
	

	public Customer readCustomer(int id) {
	Customer customer = this.customerRepo.findById(id).orElseThrow(IdNotFoundException::new);
	return customer;
}
		
	
	//Update
	public Customer updateCustomer(Customer newCustomer, int id) {
	Customer updateCustomer = readCustomer(id);

	updateCustomer.setCustomerName(newCustomer.getCustomerName());
	updateCustomer.setCustomerAddress(newCustomer.getCustomerAddress());
	updateCustomer.setCustomerPhone(newCustomer.getCustomerPhone());
	updateCustomer.setCustomerEmail(newCustomer.getCustomerEmail());
	updateCustomer.setCustomerPassword(newCustomer.getCustomerPassword());

	Customer saved = this.customerRepo.save(updateCustomer);
	return saved;
}

	
	//Delete
	public boolean deleteCustomer(int id) {
		this.customerRepo.deleteById(id);
		boolean deleted = !this.customerRepo.existsById(id);
		return deleted;
	}

	
	
	
	

}
