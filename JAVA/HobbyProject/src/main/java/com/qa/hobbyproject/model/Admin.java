package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin {
	
	@Id
	@GeneratedValue
	@Column(name="admin_id")
	private int adminId;
	
	@Column(length=50, name="admin_name")
	private String adminName;
	@Column(length=100, name="admin_email")
	private String adminEmail;
	@Column(length=15, name="admin_password")
	private String adminPassword;
	
	public Admin(String adminName, String adminEmail, String adminPassword) {
		
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		
	}

	public int getId() {
		return adminId;
	}

	public void setId(int adminId) {
		this.adminId = adminId;
	}
	
	public String getName() {
	
		return this.adminName;
	}

	public void setName(String name) {
	this.adminName = name;
		
	}


	public String getEmail() {
		
		return this.adminEmail;
	}


	public void setEmail(String email) {
		
		this.adminEmail = email;
	}

	
	public String getPassword() {
		
		return this.adminPassword;
	}


	public void setPassword(String password) {
		this.adminPassword = password;
		
	}

	


	
}
	