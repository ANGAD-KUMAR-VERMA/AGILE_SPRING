package com.cognizant.medicare_authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.UserFeedback;

@Repository
public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Long> {

	
	public UserFeedback findByAssessmentId(long id);
	public List<UserFeedback> findByDoctorId(long id);
	
}
