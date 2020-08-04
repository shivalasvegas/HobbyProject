package com.qa.hobbyproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.hobbyproject.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	// Select list of customers 
	public List<Customer> findByCustomers(int customerId);
	
	
//	// Select list of customer names from table customers
//	@Query(value="SELECT customer_name FROM customers", nativeQuery=true)
//	public List<String> customersByName();
//	
//	// Select a list of customers by name and address from table customers
//	@Query(value="SELECT DISTINCT customer_name FROM customers WHERE address=?1", nativeQuery=true)
//	public List<String> customerByNameAndAddress();
	
	
	
}
