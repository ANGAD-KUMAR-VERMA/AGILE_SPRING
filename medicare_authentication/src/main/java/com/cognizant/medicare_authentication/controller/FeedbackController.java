package com.cognizant.medicare_authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.Feedback;
import com.cognizant.medicare_authentication.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	 @Autowired
	 private FeedbackService feedbackService;
	 
	 @PostMapping
		public void signup(@RequestBody Feedback feedback) {
			feedbackService.signUp(feedback);
		}
	 
	 @GetMapping("/{id}")
	 public Feedback getQuestions(@PathVariable long id) {
		 return feedbackService.getFeedback(id);
	 }
	 
	 @GetMapping()
	 public List<Feedback> getFeedback() {
		 return feedbackService.getAllFeedback();
	 }
	 
	 
}
