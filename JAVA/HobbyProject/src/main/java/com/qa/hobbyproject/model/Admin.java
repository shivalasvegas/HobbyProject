package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin implements User {
	
	@Id
	@GeneratedValue
	@Column(name="admin_id")
	private int adminId;
	
	@Column(length=50, name="admin_name")
	private String name;
	@Column(length=100, name="admin_email")
	private String email;
	@Column(length=15, name="admin_password")
	private String password;
	
	public Admin(String adminName, String adminEmail, String adminPassword) {
		this.name = adminName;
		this.email = adminEmail;
		this.password = adminPassword;
		
	}

	public int getId() {
		return adminId;
	}

	public void setId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
	