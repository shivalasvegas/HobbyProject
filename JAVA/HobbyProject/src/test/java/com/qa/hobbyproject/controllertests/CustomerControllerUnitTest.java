package com.qa.hobbyproject.controllertests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.hobbyproject.model.Customer;
import com.qa.hobbyproject.repositories.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerUnitTest {
	
	@Autowired
	private MockMvc mock;
	
	@Autowired
	private CustomerRepository repo;
	
	@Autowired 
	private ObjectMapper mapper = new ObjectMapper();
	
	private Customer testCustomer;
	private Customer newTestCustomer;
	private Customer testCustomerWithID;
	private int id;
	private List<Customer> listCustomer = new ArrayList<>();
	
	@Before
	public void init() {
		this.repo.deleteAll();
		this.testCustomer = new Customer("Arthur Dent", "155 Cottinghom Lane", "01273567456", "adent@earth.com", "123345");
		
		this.testCustomerWithID = this.repo.save(this.testCustomer);
		this.id = this.testCustomerWithID.getId();
		this.testCustomerWithID.setId(id);
		
		this.listCustomer.add(testCustomerWithID);
	}

	
}
