package com.cognizant.medicare_authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.MedicareServices;

@Repository
public interface MedicareServiceRepository extends JpaRepository<MedicareServices, Long> {

	MedicareServices findById(long id);
	MedicareServices findByMedicareService(String medicareService);
}
