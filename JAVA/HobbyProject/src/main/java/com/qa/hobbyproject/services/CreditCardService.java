package com.qa.hobbyproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbyproject.exceptions.CardNotFoundException;
import com.qa.hobbyproject.model.CreditCard;
import com.qa.hobbyproject.repositories.CreditCardRepository;

@Service
public class CreditCardService {
	
	@Autowired
	CreditCardRepository cardRepo;
	
	//Create
	public String createCard(CreditCard card) {
		this.cardRepo.save(card);
		return "Card record created";
	}
	
	
	//Read
	public List<CreditCard> readAllCards() {
		List<CreditCard> cardRecords = this.cardRepo.findAll();
		return cardRecords;
	
	}
	

	public CreditCard readCard(int id) {
	CreditCard card = this.cardRepo.findById(id).orElseThrow(CardNotFoundException::new);
	return card;
}
		
	
	//Update
	public CreditCard updateCard(CreditCard newCard, int id) {
	CreditCard updateCard = readCard(id);

	updateCard.setCustomer(newCard.getCustomer());
	updateCard.setCardNumber(newCard.getCardNumber());
	
	CreditCard saved = this.cardRepo.save(updateCard);
	return saved;
}

	
	//Delete
	public boolean deleteCard(int id) {
		this.cardRepo.deleteById(id);
		boolean deleted = !this.cardRepo.existsById(id);
		return deleted;
	}


}
