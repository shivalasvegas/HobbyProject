package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name="customers")
public class Customer implements User{

	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int customerId;
	
	@Column(length=50, name="customer_name")
	private String name;
	@Column(length=100, name="customer_address")
	private String address;
	@Column(length=20, name="customer_phone")
	private String phone;
	@Column(length=100, name="customer_email")
	private String email;
	@Column(length=15, name="customer_password")
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(String customerName, String customerAddress, String customerPhone, String customerEmail, String customerPassword) {

		this.name = customerName;
		this.address = customerAddress;
		this.phone = customerPhone;
		this.email = customerEmail;
		this.password = customerPassword;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String customerName) {
		this.name = customerName;
	}
	public String getCustomerAddress() {
		return this.address;
	}
	public void setCustomerAddress(String customerAddress) {
		this.address = customerAddress;
	}
	public String getCustomerPhone() {
		return this.phone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.phone = customerPhone;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String customerEmail) {
		this.email = customerEmail;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String customerPassword) {
		this.password = customerPassword;
	}
	
	
	
	
}
