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
import com.qa.hobbyproject.model.Admin;
import com.qa.hobbyproject.services.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService service;

	@PostMapping("/createadmin")
	public String createAdminRecord(@RequestBody Admin admin) {
		String message = this.service.createAdmin(admin);

		return message;
	}

	@GetMapping("/readalladmins")
	public List<Admin> readAllAdminRecords() {
		List<Admin> record = service.readAllAdmins();

		return record;
	}

	// @PutMapping("/updateadmin/{id}")

	@DeleteMapping("/deleteadmin/{id}")

	public String deleteAdmin(@PathVariable int id) throws IdNotFoundException {
		boolean deleted = this.service.deleteAdmin(id);

		String message;
		try {
			if (deleted)
				message = "Admin deleted";
			else
				message = "Id does not exist";
		} catch (IdNotFoundException cardException) {
			message = "Please enter another id";
		}

		return message;
	}
}