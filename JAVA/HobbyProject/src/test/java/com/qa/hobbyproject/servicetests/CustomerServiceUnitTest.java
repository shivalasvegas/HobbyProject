package com.qa.hobbyproject.servicetests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.hobbyproject.model.Customer;
import com.qa.hobbyproject.repositories.CustomerRepository;
import com.qa.hobbyproject.services.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceUnitTest {
	@MockBean
	private CustomerRepository repo;

	@Autowired
	private CustomerService service;

	private Optional<Customer> testOpCustomer;
	private Customer testCustomer;
	private Customer testNewCustomer;
	private Customer testNewCustomerWithId;

	private int id;
	private List<Customer> listCustomer = new ArrayList<>();

	@Before
	public void init() {

		this.testCustomer = new Customer("Arthur Dent", "155 Cottinghom Lane", "01273567456", "adent@earth.com",
				"123345");
		this.testCustomer.setCustomerId(1);
		this.id = this.testCustomer.getCustomerId();

		this.testOpCustomer = Optional.ofNullable(this.testCustomer);
		this.testNewCustomer = new Customer("Ford Prefect", "The Universe", "0000111", "perfect@universe.com",
			"towelsrus");
		this.testNewCustomerWithId = new Customer("Ford Prefect", "The Universe", "0000111", "perfect@universe.com",
				"towelsrus"); ;
		this.testNewCustomerWithId.setCustomerId(1);
	}

	@Test
	public void testCreate_createCustomer() {
		when(this.repo.save(testCustomer)).thenReturn(new Customer());

		String message = this.service.createCustomer(this.testCustomer);
		assertEquals("Customer record created", message);
	}

	@Test
	public void testRead_readCustomer() {
		when(this.repo.findById(id)).thenReturn(this.testOpCustomer);
		Optional<Customer> optCustomer = Optional.ofNullable(this.service.readCustomer(this.id));
		assertEquals(this.testOpCustomer, optCustomer);
	}

	@Test
	public void testReadAll_readAllCustomers() {
		when(this.repo.findAll()).thenReturn(this.listCustomer);
		List<Customer> newListCustomer = this.service.readAllCustomers();
		assertEquals(this.listCustomer, newListCustomer);
	}

	@Test
	public void testUpdate_updateCustomer() {
		when(this.repo.findById(this.id)).thenReturn(this.testOpCustomer);
		
		when(this.repo.save(this.testCustomer)).thenReturn(this.testNewCustomerWithId);

		Customer updated = this.service.updateCustomer(this.testNewCustomer, this.id);
		assertEquals(this.testNewCustomerWithId, updated);
	}

	@Test
	public void testDelete_deleteCustomer() {
		when(this.repo.findById(this.id)).thenReturn(this.testOpCustomer).thenReturn(null);
		boolean deletedRepo = !this.repo.existsById(this.id);
		boolean deleted = this.service.deleteCustomer(this.id);

		assertEquals(deletedRepo, deleted);

	}

}
