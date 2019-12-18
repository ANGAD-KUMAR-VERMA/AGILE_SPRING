
package com.cognizant.medicare_authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping
	public void signup(@RequestBody MedicalTestHistory medicalTestHistory) {
		medicalTestHistoryService.signUp(medicalTestHistory);
	}
	
	@GetMapping
	public List<MedicalTestHistory> getAllTestHistoryResults(){
		return medicalTestHistoryService.getAllMedicalTestResults();
	}
	
	@GetMapping("/{id}")
	public List<MedicalTestHistory> getTestHistory(@PathVariable long id) {
		return medicalTestHistoryService.getTestHistoryByPatientId(id);
	}
}
