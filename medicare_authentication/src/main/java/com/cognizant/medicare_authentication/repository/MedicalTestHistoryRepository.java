package com.cognizant.medicare_authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.MedicalTestHistory;

@Repository
public interface MedicalTestHistoryRepository extends JpaRepository<MedicalTestHistory, Long> {
	
	public List<MedicalTestHistory> findByCustomerId(long id);
	public List<MedicalTestHistory> findByDoctorId(long id);

	 
	
}
