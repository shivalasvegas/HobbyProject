package com.qa.hobbyproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hobbyproject.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
