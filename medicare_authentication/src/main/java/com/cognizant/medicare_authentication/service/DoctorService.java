package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.repository.DoctorRepository;

@Service
public class DoctorService {

@Autowired
DoctorRepository doctorRepo;
	
public List<Doctor> getAllDoctors() {
	return doctorRepo.findAll();
}

}
