package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.SecurityQue;
import com.cognizant.medicare_authentication.repository.SecurityQueRepository;

@Service
public class SecurityQueService {

	@Autowired
	private SecurityQueRepository securityQueRepository;
	
	public void signup(SecurityQue securityQue) {
		securityQueRepository.save(securityQue);
	}
	
	public List<SecurityQue> getAll(){
		return securityQueRepository.findAll();
	}
	
}
