package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin implements User{
	
	@Id
	@GeneratedValue
	@Column(name="admin_id")
	private int adminId;
	
	@Column(length=50, name="admin_name")
	private String name;
	@Column(length=100, name="admin_address")
	private String address;
	@Column(length=20, name="admin_phone")
	private String phone;
	@Column(length=100, name="admin_email")
	private String email;
	@Column(length=15, name="admin_password")
	private String password;
	
	public Admin(String adminName, String adminAddress, String adminPhone, String adminEmail, String adminPassword) {
		
		this.name = adminName;
		this.address = adminAddress;
		this.phone = adminPhone;
		this.email = adminEmail;
		this.password = adminPassword;
		
	}

	public int getId() {
		return adminId;
	}

	public void setId(int adminId) {
		this.adminId = adminId;
	}

	

	@Override
	public String getName() {
	
		return this.name;
	}

	@Override
	public void setName(String name) {
	
		
	}

	@Override
	public String getEmail() {
		
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		
		
	}

	@Override
	public String getPassword() {
		
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		
		
	}

	@Override
	public String getAddress() {
		
		return null;
	}

	@Override
	public void setAddress(String address) {
		
		
	}

	@Override
	public String getPhone() {
		
		return null;
	}

	@Override
	public void setPhone(String phone) {
	
	}
	

	
}
	