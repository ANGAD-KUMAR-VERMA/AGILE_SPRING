package com.cognizant.medicare_authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	
	public Admin findByUsername(String username);
}
