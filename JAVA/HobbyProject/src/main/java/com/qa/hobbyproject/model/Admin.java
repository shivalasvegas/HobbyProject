package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="creditcards")
public class Admin {
	
	@Id
	@GeneratedValue
	@Column(name="creditcard_id")
	private int creaditCardId;
	
	@OneToOne
	private Customer customer;
	
	@Column(length=20, name="card_number")
	private String cardNumber;
	
	public Admin() {
		
	}
	
	public Admin(Customer customer, String cardNumber) {
		this.customer = customer;
		this.cardNumber = cardNumber;
		
	}

	public int getCreaditCardId() {
		return creaditCardId;
	}

	public void setCreaditCardId(int creaditCardId) {
		this.creaditCardId = creaditCardId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	
}
	