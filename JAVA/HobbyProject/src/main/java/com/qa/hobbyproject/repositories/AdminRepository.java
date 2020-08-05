package com.qa.hobbyproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.qa.hobbyproject.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	//public List<CreditCard> findByCreditCards(int cardId);

}
