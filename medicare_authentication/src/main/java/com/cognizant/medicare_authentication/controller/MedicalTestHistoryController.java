
package com.cognizant.medicare_authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.MedicalTestHistory;
import com.cognizant.medicare_authentication.service.MedicalTestHistoryService;

@RestController
@RequestMapping("/medicalTestHistory")
public class MedicalTestHistoryController {

	@Autowired
	MedicalTestHistoryService medicalTestHistoryService;
	
	
	
	@PostMapping("/{id}")
	public void signup(@PathVariable long id, @RequestBody MedicalTestHistory medicalTestHistory) {
		medicalTestHistoryService.signUp(id,medicalTestHistory);
	}
	
	@PutMapping("put")
	public void update( @RequestBody MedicalTestHistory medicalTestHistory) {
		medicalTestHistoryService.update( medicalTestHistory);
	}
	
	@GetMapping
	public List<MedicalTestHistory> getAllTestHistoryResults(){
		return medicalTestHistoryService.getAllMedicalTestResults();
	}
	
	@GetMapping("/patient/{id}")
	public List<MedicalTestHistory> getTestHistory(@PathVariable long id) {
		return medicalTestHistoryService.getTestHistoryByPatientId(id);
	}
	
	@GetMapping("/agent/{id}")
	public List<MedicalTestHistory> getAgentTestHistory(@PathVariable long id) {
		return medicalTestHistoryService.getTestHistoryByAgentId(id);
	}
	
	@GetMapping("{id}")
	public List<MedicalTestHistory> getDoctorTestHistory(@PathVariable long id) {
		return medicalTestHistoryService.getTestHistoryByDoctorId(id);
	}
	
	@GetMapping("/get/{id}")
	public MedicalTestHistory getById(@PathVariable long id) {
		return medicalTestHistoryService.getTestHistoryById(id);
	}
}
