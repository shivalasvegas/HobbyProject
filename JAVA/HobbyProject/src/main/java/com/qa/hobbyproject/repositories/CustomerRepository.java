package com.qa.hobbyproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.hobbyproject.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public List<Customer> findByCustomers(int customerId);
	
	@Query(value="SELECT customer_name FROM customers", nativeQuery=true)
	public List<String> customerByName();
	
}
