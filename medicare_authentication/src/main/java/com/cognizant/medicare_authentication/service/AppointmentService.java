package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.repository.AppointmentRespository;

@Service
public class AppointmentService {

	
	@Autowired
	private AppointmentRespository appointmentRespository;
	
	public List<Appointment> getAppointments(){
		return appointmentRespository.findAll();
	}
	
	public Appointment getAppointment(long appointmentId) {
		return appointmentRespository.findById(appointmentId).get();
	}
	
	public void modifyAppointment(Appointment appointment) {
		Appointment newappointment=appointmentRespository.findById(appointment.getId()).get();
		
		newappointment.setBookingDate(appointment.getBookingDate());
		newappointment.setAppointmentDate(appointment.getAppointmentDate());
		newappointment.setStatus(appointment.getStatus());
		newappointment.setAgent(appointment.getAgent());
		newappointment.setDoctor(appointment.getDoctor());
		newappointment.setPatient(appointment.getPatient());
		appointmentRespository.save(newappointment);
	}

}
