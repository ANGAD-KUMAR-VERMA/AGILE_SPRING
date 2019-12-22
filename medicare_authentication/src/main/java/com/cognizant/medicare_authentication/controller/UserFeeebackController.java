package com.cognizant.medicare_authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.UserFeedback;
import com.cognizant.medicare_authentication.service.UserFeedbackService;

@RestController
@RequestMapping("/userFeedback")
public class UserFeeebackController {

	@Autowired
	private UserFeedbackService userFeedbackService;
	
	@GetMapping("/{id}")
	public UserFeedback getFeedback(@PathVariable long id) {
		return userFeedbackService.getFeedback(id);
	}
	
	@PostMapping
	public void signup(@RequestBody UserFeedback userFeedback) {
		userFeedbackService.signup(userFeedback);
	}
	
	@GetMapping
	public List<UserFeedback> getAllFeedback(){
		return userFeedbackService.getAllFeedback();
	}
	
	@GetMapping("/doctor/{id}")
	public List<UserFeedback> getAllFeedbackByDoctor(@PathVariable long id){
		return userFeedbackService.getAllFeedbackByDoctor(id);
	}
}
