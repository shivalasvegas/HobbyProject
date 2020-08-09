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
	AdminRepository adminRepo;
	
	//Create
	public String createAdmin(Admin admin) {
		this.adminRepo.save(admin);
		return "Admin record created";
	}
	
	
	//Read
	public List<Admin> readAllAdmins() {
		List<Admin> adminRecords = this.adminRepo.findAll();
		return adminRecords;
	
	}
	

	public Admin readAdmin(int id) {
	Admin admin = this.adminRepo.findById(id).orElseThrow(IdNotFoundException::new);
	return admin;
}
		
	
	//Update
	public Admin updateAdmin(Admin newAdmin, int id) {
	Admin updateAdmin = readAdmin(id);

	updateAdmin.setAdminName(newAdmin.getAdminName());
	updateAdmin.setAdminEmail(newAdmin.getAdminEmail());
	updateAdmin.setAdminPassword(newAdmin.getAdminPassword());
	
	Admin saved = this.adminRepo.save(updateAdmin);
	return saved;
}

	
	//Delete
	public boolean deleteAdmin(int id) {
		this.adminRepo.deleteById(id);
		boolean deleted = !this.adminRepo.existsById(id);
		return deleted;
	}


}
