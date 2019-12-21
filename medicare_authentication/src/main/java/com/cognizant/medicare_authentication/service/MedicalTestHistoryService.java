package com.cognizant.medicare_authentication.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.MedicalTestHistory;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.repository.MedicalTestHistoryRepository;
import com.cognizant.medicare_authentication.repository.PatientRepository;

@Service
public class MedicalTestHistoryService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private MedicalTestHistoryRepository medicalTestHistoryRepository;
	
	public void signUp(long  id,MedicalTestHistory medicalTestHistory)  {
		Patient patient=patientRepository.findById(id).get();
		Set<MedicalTestHistory> set = patient.getMedicalTestHistoryList();
		if(set.size()!=0) {
			set.add(medicalTestHistory);
		}else {
			set = new HashSet<MedicalTestHistory>();
			set.add(medicalTestHistory);
		}
		
		patient.setMedicalTestHistoryList(set);
		medicalTestHistory.setPatient(patient);
		medicalTestHistoryRepository.save(medicalTestHistory);
	}
	
	
	public List<MedicalTestHistory> getAllMedicalTestResults(){
		return medicalTestHistoryRepository.findAll();
	}
	
	public List<MedicalTestHistory> getTestHistoryByPatientId(long id) {
		return medicalTestHistoryRepository.findByCustomerId(id);
	}
	
	public List<MedicalTestHistory> getTestHistoryByDoctorId(long id) {
		return medicalTestHistoryRepository.findByDoctorId(id);
	}

}
