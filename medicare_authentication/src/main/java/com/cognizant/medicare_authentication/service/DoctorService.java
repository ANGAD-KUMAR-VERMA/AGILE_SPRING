package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.repository.DoctorRepository;

@Service
public class DoctorService {

@Autowired
DoctorRepository doctorRepo;
	
public List<Doctor> getAllDoctors() {
	return doctorRepo.findAll();
}

public Doctor getDoctor(long id) {
	return doctorRepo.findById(id).get();
}

public void modifyDoctor(Doctor doctor) {
	Doctor newDoctor=doctorRepo.findByUsername(doctor.getUsername());
	
	newDoctor.setUsername(doctor.getUsername());
	newDoctor.setFirstname(doctor.getFirstname());
	newDoctor.setLastname(doctor.getLastname());
	newDoctor.setAge(doctor.getAge());
	newDoctor.setGender(doctor.getGender());
	newDoctor.setDateOfBirth(doctor.getDateOfBirth());
	newDoctor.setAddress1(doctor.getAddress1());
	newDoctor.setAddress2(doctor.getAddress2());
	newDoctor.setEmail(doctor.getEmail());
	newDoctor.setContactNo(doctor.getContactNo());
	newDoctor.setAltContactNo(doctor.getAltContactNo());
	newDoctor.setCity(doctor.getCity());
	newDoctor.setState(doctor.getState());
	newDoctor.setZipcode(doctor.getZipcode());
	newDoctor.setDegree(doctor.getDegree());
	newDoctor.setSpeciality(doctor.getSpeciality());
	newDoctor.setWorkhours(doctor.getWorkhours());
	newDoctor.setHospitalname(doctor.getHospitalname());
	newDoctor.setStatus(doctor.isStatus());
	
	doctorRepo.save(newDoctor);
}


}
