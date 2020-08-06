package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer extends User{

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
		super();
		this.name = customerName;
		this.address = customerAddress;
		this.phone = customerPhone;
		this.email = customerEmail;
		this.password = customerPassword;
	}
	
	public int getId() {
		return customerId;
	}
	public void setId(int customerId) {
		this.customerId = customerId;
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
	
	
}
