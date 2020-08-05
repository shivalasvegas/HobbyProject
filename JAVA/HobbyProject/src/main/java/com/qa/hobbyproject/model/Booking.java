package com.qa.hobbyproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="bookings")
public class Booking {
	
	@Id
	@GeneratedValue
	@Column(name="booking_id")
	private int bookingId;
	
	@ManyToOne
	@JoinColumn(name="fk_customer_id")
	private Customer customer;
	
	@Column(length=10, name="booking_date")
	private String bookingDate;
	@Column(length=20)
	private String workshop;
	@Column(precision=2)
	private double price;
	@Column(name="payment_type")
	private String paymentType;
	
	public Booking() {
		
	}
	
	public Booking(Customer customer, String bookingDate, String workshop, String paymentType, double price) {
		this.customer = customer;
		this.bookingDate = bookingDate;
		this.workshop = workshop;
		this.paymentType = paymentType;
		this.price = price;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getWorkshop() {
		return workshop;
	}
	public void setWorkshop(String workshop) {
		this.workshop = workshop;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
