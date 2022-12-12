package com.medical.medicalshopmanagementsystem.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medicalshopmanagementsystem.Repository.AdminRepository;
import com.medical.medicalshopmanagementsystem.entity.Admin;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Transactional

	public Admin validateAdmin(Admin admin) {
		Admin a=adminRepository.validateAdmin(admin.getAdminid(),admin.getPassword());
		
		return a;
	}
}
