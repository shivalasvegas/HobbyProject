package com.qa.hobbyproject.servicetests;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.hobbyproject.repositories.CustomerRepository;
import com.qa.hobbyproject.services.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@MockBean
	private CustomerRepository repo;

	@Autowired
	private CustomerService service;
	
	
}
