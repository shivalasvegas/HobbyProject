package com.qa.hobbyproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.hobbyproject.exceptions.IdNotFoundException;
import com.qa.hobbyproject.model.Booking;
import com.qa.hobbyproject.repositories.BookingRepository;

public class BookingService {
	@Autowired
	BookingRepository bookingRepo;
	
	//Create
	public String createBooking(Booking booking) {
		this.bookingRepo.save(booking);
		return "Booking record created";
	}
	
	
	//Read
	public List<Booking> readAllBookings() {
		List<Booking> bookingRecords = this.bookingRepo.findAll();
		return bookingRecords;
	
	}
	

	public Booking readBooking(int id) {
	Booking booking = this.bookingRepo.findById(id).orElseThrow(IdNotFoundException::new);
	return booking;
}
		
	
	//Update
	public Booking updateBooking(Booking newBooking, int id) {
	Booking updateBooking = readBooking(id);

	updateBooking.setBookingId(newBooking.getBookingId());
	updateBooking.setBookingDate(newBooking.getBookingDate());
//	updateBooking.setBookingPhone(newBooking.getBookingPhone());
//	updateBooking.setBookingEmail(newBooking.getBookingEmail());
//	updateBooking.setBookingPassword(newBooking.getBookingPassword());

	Booking saved = this.bookingRepo.save(updateBooking);
	return saved;
}

	
	//Delete
	public boolean deleteBooking(int id) {
		this.bookingRepo.deleteById(id);
		boolean deleted = !this.bookingRepo.existsById(id);
		return deleted;
	}
}
