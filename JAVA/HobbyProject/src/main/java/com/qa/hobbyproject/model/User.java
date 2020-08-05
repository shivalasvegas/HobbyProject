package com.qa.hobbyproject.model;

import javax.persistence.Entity;

@Entity
public interface User {
	
	public String getName();
	
	public void setName(String name);

	public String getEmail();

	public void setEmail(String email);
	
	public String getPassword();
	
	public void setPassword(String password);
	
}
