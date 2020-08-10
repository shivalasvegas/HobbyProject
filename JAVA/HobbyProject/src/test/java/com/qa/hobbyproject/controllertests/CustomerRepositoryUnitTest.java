package com.qa.hobbyproject.controllertests;
//package com.qa.hobbyproject.controllertests;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.hobbyproject.controllers.CustomerController;
//import com.qa.hobbyproject.model.Customer;
//import com.qa.hobbyproject.repositories.CustomerRepository;
//import com.qa.hobbyproject.services.CustomerService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CustomerRepositoryTest {
//
////	@Autowired
////	private MockMvc mock;
//
//	@MockBean
//	private CustomerService service;
//
//	@Autowired
//	private CustomerController controller;
//
//	@Autowired
//	private ObjectMapper mapper = new ObjectMapper();
//
//	private Customer testCustomer;
//	// private Customer newTestCustomer;
//	private Customer testCustomerWithID;
//	private int id;
//	private List<Customer> listCustomer = new ArrayList<>();
//
//	@Before
//	public void init() {
//
////		this.repo.deleteAll();
//		this.testCustomer = new Customer("Arthur Dent", "155 Cottinghom Lane", "01273567456", "adent@earth.com",
//				"123345");
////		
////		this.testCustomerWithID = this.repo.save(this.testCustomer);
////		this.id = this.testCustomerWithID.getCustomerId();
////		this.testCustomerWithID.setCustomerId(id);
////		
////		this.listCustomer.add(testCustomerWithID);
//	}
//
//	@Test
//	public void testCreate_createCustomerRecord() {
//		when(this.service.createCustomer(testCustomer)).thenReturn("Customer record created");
//		String result = this.controller.createCustomerRecord(testCustomer);
//		assertEquals("Customer record created", result);
//	}
//
////	@Test
////	public void testCreate() throws JsonProcessingException, Exception{
////		MockHttpServletRequestBuilder mockRequest = 
////				MockMvcRequestBuilders.request(HttpMethod.POST, "/customer/createcustomer");
////		
////		mockRequest.contentType(MediaType.APPLICATION_JSON)
////			.content(this.mapper.writeValueAsString(testCustomerWithID))
////			.accept(MediaType.APPLICATION_JSON);
////	
////		ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
////		ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.mapper.writeValueAsString(testCustomerWithID));
////		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
////	}
//
////	@Test
////	public void testRead() throws JsonProcessingException, Exception {
////		MockHttpServletRequestBuilder mockRequest = 
////				MockMvcRequestBuilders.request(HttpMethod.GET, "/customer/read/1");
////		
////		mockRequest.contentType(MediaType.APPLICATION_JSON)
////			.content(this.mapper.writeValueAsString(testCustomerWithID))
////			.accept(MediaType.APPLICATION_JSON);
////	
////		ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
////		ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.mapper.writeValueAsString(testCustomerWithID));
////		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
////	}
//
////	@Test
////	public void testReadAll() throws JsonProcessingException, Exception {
////		MockHttpServletRequestBuilder mockRequest = 
////				MockMvcRequestBuilders.request(HttpMethod.GET, "/customer/readAllCustomer");
////		
////		mockRequest.contentType(MediaType.APPLICATION_JSON)
////			.content(this.mapper.writeValueAsString(listCustomer))
////			.accept(MediaType.APPLICATION_JSON);
////	
////		ResultMatcher matchStatus = MockMvcResultMatchers.status().isOk();
////		ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.mapper.writeValueAsString(listCustomer));
////		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
////	}
//
////	@Test
////	public void testUpdate() throws JsonProcessingException, Exception {
////		this.newTestCustomer = new Customer("Doctor Who", "The Tardis", "000004442227456", "thedoctor@universe.com", "boring");
////		this.newTestCustomer.setId(testCustomerWithID.getId());
////	MockHttpServletRequestBuilder mockRequest = 
////	MockMvcRequestBuilders.request(HttpMethod.PUT, "/customer/updatecustomer/" + testCustomerWithID.getId());
////		
////	mockRequest.contentType(MediaType.APPLICATION_JSON)
////	.content(this.mapper.writeValueAsString(newTestCustomer))
////	.accept(MediaType.APPLICATION_JSON);
////
////	ResultMatcher matchStatus = MockMvcResultMatchers.status().isAccepted();
////	ResultMatcher matchContent = MockMvcResultMatchers.content().json(this.mapper.writeValueAsString(newTestCustomer));
////	this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchContent);
////	}
////	
////	@Test
////	public void testDelete() throws JsonProcessingException, Exception {
////		MockHttpServletRequestBuilder mockRequest = 
////				MockMvcRequestBuilders.request(HttpMethod.DELETE, "/customer/deletecustomer/1" + testCustomerWithID.getCustomerId());
////		
////		mockRequest.contentType(MediaType.APPLICATION_JSON)
////			.content(this.mapper.writeValueAsString(testCustomerWithID))
////			.accept(MediaType.APPLICATION_JSON);
////	
////		ResultMatcher matchStatus = MockMvcResultMatchers.status().isNoContent();
////		this.mock.perform(mockRequest).andExpect(matchStatus);
////	}
//
//}
