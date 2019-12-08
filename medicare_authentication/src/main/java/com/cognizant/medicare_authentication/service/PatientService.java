package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
	public Patient getPatient(long id) {
		return patientRepository.findById(id).get();
	}
	
	public void modifyPatient(Patient patient) {
		patientRepository.save(patient);
	}
	
	
	
	
}
