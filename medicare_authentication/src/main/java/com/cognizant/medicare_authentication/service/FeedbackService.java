package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Feedback;
import com.cognizant.medicare_authentication.model.MedicalTestHistory;
import com.cognizant.medicare_authentication.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public void signUp(Feedback feedback)  {
		feedbackRepository.save(feedback);
	}
	
	public Feedback getFeedback(long id)
	{
		return feedbackRepository.findById(id).get();
	}
	
	public List<Feedback> getAllFeedback(){
		return feedbackRepository.findAll();
	}
}
