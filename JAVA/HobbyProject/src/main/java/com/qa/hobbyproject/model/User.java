package com.qa.hobbyproject.model;

import javax.persistence.Embeddable;
//import javax.persistence.Entity;
//import javax.persistence.Id;

@Embeddable
public interface User {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);

	public String getEmail();

	public void setEmail(String email);
	
	public String getPassword();
	
	public void setPassword(String password);
	
}
