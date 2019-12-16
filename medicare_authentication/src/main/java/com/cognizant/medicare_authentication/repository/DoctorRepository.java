package com.cognizant.medicare_authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	public Doctor findByUsername(String username);
}
