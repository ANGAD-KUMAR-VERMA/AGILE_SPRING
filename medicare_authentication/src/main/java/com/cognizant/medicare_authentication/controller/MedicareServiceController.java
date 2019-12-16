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

import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.model.MedicareServices;
import com.cognizant.medicare_authentication.service.MedicareServicesService;

@RestController
@RequestMapping("/medicareServices")
public class MedicareServiceController {

	@Autowired
	MedicareServicesService medicareServicesService;
	
	@PostMapping
	public void signUp(@RequestBody  MedicareServices medicareServices)  {
		 medicareServicesService.signUp(medicareServices);
	}
	
	@GetMapping
	public List<MedicareServices> getAllServices(){
		return medicareServicesService.getAllServices();
	}
	
	@GetMapping("/{id}")
	public MedicareServices getMedicareServices(@PathVariable long id) {
		return medicareServicesService.getService(id);
	}
	

	@PutMapping()
	public void modifyMedicareService(@RequestBody MedicareServices medicareServices){
		medicareServicesService.updateService(medicareServices);
	}
	
}
