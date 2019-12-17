package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Admin;
import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.repository.AdminRepository;
import com.cognizant.medicare_authentication.repository.AppointmentRespository;

@Service
public class AdminService {

	
	@Autowired
	private AppointmentRespository appointmentRespository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin getAdminByUsername(String username) {
		return adminRepository.findByUsername(username);
	}
	
	
}
