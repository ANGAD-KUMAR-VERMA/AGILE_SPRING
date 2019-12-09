package com.cognizant.medicare_authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	public Patient findByUsername(String username);
	
}
