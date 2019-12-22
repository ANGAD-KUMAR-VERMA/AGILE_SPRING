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
	
	public void update(MedicalTestHistory medicalTestHistory)  {
		System.out.println("first"+medicalTestHistory);
		MedicalTestHistory newMedicalTestHistory=new MedicalTestHistory();
		//MedicalTestHistory newMedicalTestHistory =medicalTestHistoryRepository.findByDoctorComments(medicalTestHistory.getDoctorComments());
		System.out.println("kjkjkjkj"+newMedicalTestHistory);
		newMedicalTestHistory.setReportId(medicalTestHistory.getReportId());
		newMedicalTestHistory.setAgentId(medicalTestHistory.getAgentId());
		newMedicalTestHistory.setCustomerId(medicalTestHistory.getCustomerId());
		newMedicalTestHistory.setDoctorId(medicalTestHistory.getDoctorId());
		newMedicalTestHistory.setDiagActualValue_1(medicalTestHistory.getDiagActualValue_1());
		newMedicalTestHistory.setDiagActualValue_2(medicalTestHistory.getDiagActualValue_2());
		newMedicalTestHistory.setDiagActualValue_3(medicalTestHistory.getDiagActualValue_3());
		newMedicalTestHistory.setDiagActualValue_4(medicalTestHistory.getDiagActualValue_4());
		newMedicalTestHistory.setDiagActualValue_5(medicalTestHistory.getDiagActualValue_5());
		newMedicalTestHistory.setDiagActualValue_6(medicalTestHistory.getDiagActualValue_6());
		newMedicalTestHistory.setDiagNormalRange_1(medicalTestHistory.getDiagNormalRange_1());
		newMedicalTestHistory.setDiagNormalRange_2(medicalTestHistory.getDiagNormalRange_2());
		newMedicalTestHistory.setDiagNormalRange_3(medicalTestHistory.getDiagNormalRange_3());
		newMedicalTestHistory.setDiagNormalRange_4(medicalTestHistory.getDiagNormalRange_4());
		newMedicalTestHistory.setDiagNormalRange_5(medicalTestHistory.getDiagNormalRange_5());
		newMedicalTestHistory.setDiagNormalRange_6(medicalTestHistory.getDiagNormalRange_6());
		newMedicalTestHistory.setDoctorComments(medicalTestHistory.getDoctorComments());
		newMedicalTestHistory.setOtherInfo(medicalTestHistory.getOtherInfo());
		newMedicalTestHistory.setPatient(medicalTestHistory.getPatient());
        
		System.out.println("last"+newMedicalTestHistory);
		medicalTestHistoryRepository.save(newMedicalTestHistory);
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
	
	public List<MedicalTestHistory> getTestHistoryByAgentId(long id) {
		return medicalTestHistoryRepository.findByAgentId(id);
	}
	
	public MedicalTestHistory getTestHistoryById(long id) {
		return medicalTestHistoryRepository.findById(id).get();
	}
	
	public MedicalTestHistory getTestHistoryReportId(long id) {
		return medicalTestHistoryRepository.findByReportId(id);
	}

}
