package com.cognizant.medicare_authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Patient;

public interface AppointmentRespository extends JpaRepository<Appointment, Long>{
public List<Appointment> findByPatient(Patient patient);
}
