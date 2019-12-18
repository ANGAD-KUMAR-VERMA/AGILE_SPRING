package com.cognizant.medicare_authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.SecurityQue;
import com.cognizant.medicare_authentication.service.SecurityQueService;

@RestController
@RequestMapping("/securityQue")
public class SecurityQueController {

	@Autowired
	private SecurityQueService securityQueService;
	
	@PostMapping
	public void signup(@RequestBody SecurityQue securityQue) {
		securityQueService.signup(securityQue);
	}
	
		@GetMapping
	public List<SecurityQue> getAll(){
		return securityQueService.getAll();
	}
}
