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
		Patient newPatient=patientRepository.findByUsername(patient.getUsername());
		newPatient.setUsername(patient.getUsername());
		newPatient.setFirstname(patient.getFirstname());
		newPatient.setLastname(patient.getLastname());
		newPatient.setPassword(patient.getPassword());
		newPatient.setAge(patient.getAge());
		newPatient.setGender(patient.getGender());
		newPatient.setDateOfBirth(patient.getDateOfBirth());
		newPatient.setContactNo(patient.getContactNo());
		newPatient.setAltContactNo(patient.getAltContactNo());
		newPatient.setEmail(patient.getEmail());
		newPatient.setCity(patient.getCity());
		newPatient.setState(patient.getState());
		newPatient.setZipcode(patient.getZipcode());
		
		patientRepository.save(newPatient);
	}
	
	
	
	
}
