package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.UserFeedback;
import com.cognizant.medicare_authentication.repository.UserFeedbackRepository;

@Service
public class UserFeedbackService {

	
	@Autowired
	private UserFeedbackRepository userFeedbackRepository;
	
	public void signup(UserFeedback userFeedback) {
		userFeedbackRepository.save(userFeedback);
	}
	
	public UserFeedback getFeedback(long id) {
		return userFeedbackRepository.findByAssessmentId(id);
	}
	
	public List<UserFeedback> getAllFeedback() {
		return userFeedbackRepository.findAll();
	}
	
	public List<UserFeedback> getAllFeedbackByDoctor(long id) {
		return userFeedbackRepository.findByDoctorId(id);
	}
	
	
}
