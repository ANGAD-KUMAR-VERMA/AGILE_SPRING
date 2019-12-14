package com.cognizant.medicare_authentication.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.medicare_authentication.model.MedicareServices;
import com.cognizant.medicare_authentication.repository.MedicareServiceRepository;
import com.cognizant.medicare_authentication.util.MedicareServiceExistsException;


@Service
public class MedicareServicesService {

	
	@Autowired
	MedicareServiceRepository medicareServiceRepository;
	
	public void signUp(MedicareServices newMedicareServices)  {
		medicareServiceRepository.save(newMedicareServices);
	}

	public List<MedicareServices> getAllServices()
	{
		return medicareServiceRepository.findAll();
	}
	
	public MedicareServices getService( long id) {
		return medicareServiceRepository.findById(id);
	}
	
	public void updateService(MedicareServices medicareServices)
	{
		MedicareServices newMedicareServices=medicareServiceRepository.findById(medicareServices.getId());
		newMedicareServices.setMedicareService(medicareServices.getMedicareService());
		newMedicareServices.setServiceDescription(medicareServices.getServiceDescription());
		newMedicareServices.setAmount(medicareServices.getAmount());
		medicareServiceRepository.save(newMedicareServices);
	}
}
