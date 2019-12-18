package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.MedicalTestHistory;
import com.cognizant.medicare_authentication.repository.MedicalTestHistoryRepository;

@Service
public class MedicalTestHistoryService {

	
	@Autowired
	private MedicalTestHistoryRepository medicalTestHistoryRepository;
	
	public void signUp(MedicalTestHistory medicalTestHistory)  {
		medicalTestHistoryRepository.save(medicalTestHistory);
	}
	
	public List<MedicalTestHistory> getAllMedicalTestResults(){
		return medicalTestHistoryRepository.findAll();
	}
	
	public List<MedicalTestHistory> getTestHistoryByPatientId(long id) {
		return medicalTestHistoryRepository.findByCustomerId(id);
	}

}
