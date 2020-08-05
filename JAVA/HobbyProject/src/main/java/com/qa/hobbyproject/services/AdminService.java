package com.qa.hobbyproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbyproject.exceptions.IdNotFoundException;
import com.qa.hobbyproject.model.Admin;
import com.qa.hobbyproject.repositories.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository cardRepo;
	
	//Create
	public String createCard(Admin card) {
		this.cardRepo.save(card);
		return "Card record created";
	}
	
	
	//Read
	public List<Admin> readAllCards() {
		List<Admin> cardRecords = this.cardRepo.findAll();
		return cardRecords;
	
	}
	

	public Admin readCard(int id) {
	Admin card = this.cardRepo.findById(id).orElseThrow(IdNotFoundException::new);
	return card;
}
		
	
	//Update
	public Admin updateCard(Admin newCard, int id) {
	Admin updateCard = readCard(id);

	updateCard.setCustomer(newCard.getCustomer());
	updateCard.setCardNumber(newCard.getCardNumber());
	
	Admin saved = this.cardRepo.save(updateCard);
	return saved;
}

	
	//Delete
	public boolean deleteCard(int id) {
		this.cardRepo.deleteById(id);
		boolean deleted = !this.cardRepo.existsById(id);
		return deleted;
	}


}
