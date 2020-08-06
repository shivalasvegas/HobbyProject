package com.qa.hobbyproject.model;

//import javax.persistence.Embeddable;
//import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class User {
	
	private String name;
	private String email;
	private String password;
	
	
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
