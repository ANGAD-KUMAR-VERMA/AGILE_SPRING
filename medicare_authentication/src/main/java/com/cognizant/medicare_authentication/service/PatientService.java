package com.cognizant.medicare_authentication.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Agent;
import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.repository.AgentRepository;
import com.cognizant.medicare_authentication.repository.AppointmentRespository;
import com.cognizant.medicare_authentication.repository.DoctorRepository;
import com.cognizant.medicare_authentication.repository.PatientRepository;

import net.bytebuddy.agent.builder.AgentBuilder;

@Service
public class PatientService {

	@Autowired
	private AppointmentRespository appointmentRespository;
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired 
	private AgentRepository agentRepository;
	
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
	public Patient getPatient(long id) {
		return patientRepository.findById(id).get();
	}
	
	public Patient getPatientByUsername(String username) {
		return patientRepository.findByUsername(username);
	}
	
	public void modifyPatient(Patient patient) {
		Patient newPatient=patientRepository.findByUsername(patient.getUsername());
		newPatient.setUsername(patient.getUsername());
		newPatient.setFirstname(patient.getFirstname());
		newPatient.setLastname(patient.getLastname());
		newPatient.setPassword(patient.getPassword());
		newPatient.setAge(patient.getAge());
		newPatient.setGender(patient.getGender());
		newPatient.setDateOfBirth(patient.getDateOfBirth());
		newPatient.setContactNo(patient.getContactNo());
		newPatient.setAltContactNo(patient.getAltContactNo());
		newPatient.setEmail(patient.getEmail());
		newPatient.setCity(patient.getCity());
		newPatient.setState(patient.getState());
		newPatient.setZipcode(patient.getZipcode());
		newPatient.setStatus(patient.isStatus());
		
		patientRepository.save(newPatient);
	}
	
	public boolean appointment(LocalDate appointmentDate, long doctorId, long patientId, long agentId) {
		
		try{
			Appointment appointment = new Appointment();
		
		appointment.setStatus("pending");
		appointment.setBookingDate(LocalDate.now());
		appointment.setAppointmentDate(appointmentDate);
		Doctor doctor = doctorRepository.findById(doctorId).get();
		Patient patient = patientRepository.findById(patientId).get();
		appointment.setDoctor(doctor);
		appointment.setPatient(patient);
		
		if(agentId!=0) {
			Agent agent = agentRepository.findById(agentId).get();
			appointment.setAgent(agent);
		}
		else {
			appointment.setAgent(null);
		}
		
		appointmentRespository.save(appointment);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public List<Appointment> getAppointments(long patientId) {
		Patient patient = patientRepository.findById(patientId).get();
		return appointmentRespository.findByPatient(patient);
	}
	
	
}
