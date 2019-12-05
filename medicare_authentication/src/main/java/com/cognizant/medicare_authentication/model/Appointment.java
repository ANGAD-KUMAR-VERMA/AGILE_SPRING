package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ap_id")
	private long id;
	@Column(name="ap_dr_id")
	private long doctorId;
	@Column(name="ap_pt_id")
	private long customerId;
	@Column(name="ap_first_name")
	private String firstname;
	@Column(name="ap_last_name")
	private String lastname;
	@Column(name="ap_booking_date")
	private Date bookingDate;
	@Column(name="ap_appointment_date")
	private Date appointmentDate;
	@Column(name="ap_status")
	private boolean status;
	@Column(name="ap_medical_issue")
	private String medicalIssue;

	
	public  Appointment() {
		
	}
	
}
