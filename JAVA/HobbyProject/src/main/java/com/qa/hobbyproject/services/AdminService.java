package com.qa.hobbyproject.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbyproject.exceptions.IdNotFoundException;
import com.qa.hobbyproject.model.Admin;
import com.qa.hobbyproject.repositories.AdminRepository;

@Service
public class AdminService {

	private final static Logger LOGGER = Logger.getLogger(Logger.class.getName());
	private boolean isAdmin = false;
	
	@Autowired
	AdminRepository adminRepo;

	// Create
	public String createAdmin(Admin admin) {
		this.adminRepo.save(admin);
		return "Admin record created";
	}

	// Read
	public Admin readAdmin(int id) {
		Admin admin = this.adminRepo.findById(id).orElseThrow(IdNotFoundException::new);
		LOGGER.info("Read Admin with id: " + admin.getAdminId()); 
		return admin;
	}

	public List<Admin> readAllAdmins() {
		List<Admin> adminRecords = this.adminRepo.findAll();
		LOGGER.info("Read Admins"); 
		return adminRecords;

	}
	
	public boolean checkAdminDetails(String adminEmail, String adminPassword) {
		List<Admin> adminRecords = this.adminRepo.findAll();
		LOGGER.info("Checking admin data"); 
		for (int i=0; i<adminRecords.size(); i++) {
			if (adminRecords.get(i).getAdminEmail().equals(adminEmail)) {
				if (adminRecords.get(i).getAdminPassword().equals(adminPassword)) {
					LOGGER.info("We have an admin match!"); 
					this.isAdmin = true;
				}
			}
			else {
				LOGGER.info("We have an admin fail!"); 
			}
		}
		
		return this.isAdmin;

	}

	// Update
	public Admin updateAdmin(Admin updatedAdmin, int id) {
		Admin existingAdmin = this.adminRepo.findById(id).orElseThrow(IdNotFoundException::new);

		existingAdmin.setAdminName(updatedAdmin.getAdminName());
		existingAdmin.setAdminEmail(updatedAdmin.getAdminEmail());
		existingAdmin.setAdminPassword(updatedAdmin.getAdminPassword());
		
		Admin saved = this.adminRepo.save(existingAdmin);
		LOGGER.info("Uodated admin with id: " + existingAdmin.getAdminId());
		return saved;
	}

	// Delete
	public boolean deleteAdmin(int id) {
		Admin admin = this.adminRepo.findById(id).orElseThrow(IdNotFoundException::new);
		LOGGER.info("Deleting admin with id: " + admin.getAdminId());
		
		this.adminRepo.deleteById(id);
		boolean deleted = !this.adminRepo.existsById(id);
		LOGGER.info("Admin deleted");
		return deleted;
	}

}
