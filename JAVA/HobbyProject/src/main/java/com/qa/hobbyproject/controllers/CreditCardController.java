package com.qa.hobbyproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbyproject.exceptions.IdNotFoundException;
import com.qa.hobbyproject.model.CreditCard;
import com.qa.hobbyproject.services.CreditCardService;

@RestController
public class CreditCardController {

	@Autowired
	CreditCardService service;

	@PostMapping("/createcard")
	public String createCardRecord(@RequestBody CreditCard card) {
		String message = this.service.createCard(card);

		return message;
	}

	@GetMapping("/readallcards")
	public List<CreditCard> readAllCardRecords() {
		List<CreditCard> record = service.readAllCards();

		return record;
	}

	// @PutMapping("/updatecard/{id}")

	@DeleteMapping("/deletecard/{id}")

	public String deleteCard(@PathVariable int id) throws IdNotFoundException {
		boolean deleted = this.service.deleteCard(id);

		String message;
		try {
			if (deleted)
				message = "Card deleted";
			else
				message = "Id does not exist";
		} catch (IdNotFoundException cardException) {
			message = "Please enter another id";
		}

		return message;
	}
}
