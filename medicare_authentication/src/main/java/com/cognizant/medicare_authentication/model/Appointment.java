package com.cognizant.medicare_authentication.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ap_id")
	private long id;

	
	@Column(name="ap_booking_date")
	private LocalDate bookingDate;
	@Column(name="ap_appointment_date")
	private LocalDate appointmentDate;
	@Column(name="ap_status")
	private String status;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ap_dr_id")
	private Doctor doctor;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ap_pt_id")
	private Patient patient;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ap_ag_id")
	private Agent agent;

	public  Appointment() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Appointment(long id, LocalDate bookingDate, LocalDate appointmentDate, String status, Doctor doctor, Patient patient,
			Agent agent) {
		super();
		this.id = id;
		this.bookingDate = bookingDate;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.doctor = doctor;
		this.patient = patient;
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", bookingDate=" + bookingDate + ", appointmentDate=" + appointmentDate
				+ ", status=" + status + ", doctor=" + doctor + ", patient=" + patient + ", agent=" + agent + "]";
	}
	
	
	
}
