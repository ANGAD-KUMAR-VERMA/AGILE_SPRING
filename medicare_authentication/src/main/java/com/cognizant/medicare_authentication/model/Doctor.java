package com.cognizant.medicare_authentication.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dr_id")
	private long doctor_Id;
	@Column(name="dr_first_name")
	private String firstname;
	@Column(name="dr_last_name")
	private String lastname;
	@Column(name="dr_age")
	private int age;
	@Column(name="dr_gender")
	private String gender;
	@Column(name="dr_date_of_birth")
	private Date dateOfBirth;
	@Column(name="dr_contact_no")
	private String contactNo;
	@Column(name="dr_alt_contact_no")
	private String altContactNo;
	@Column(name="dr_email")
	private String email;
	@Column(name="dr_address_1")
	private String address_1;
	@Column(name="dr_address_2")
	private String address_2;
	@Column(name="dr_city")
	private String city;
	@Column(name="dr_state")
	private String state;
	@Column(name="dr_zip_code")
	private String zipCode;
	@Column(name="dr_degree")
	private String degree;
	@Column(name="dr_speciality")
	private String speciality;
	@Column(name="dr_work_hours")
	private double workHours;
	@Column(name="dr_hospital_name")
	private String hospitalName;
	@Column(name="dr_medicare_service_id")
	private String medicareServiceId;
	
	@JsonIgnore
	@ManyToMany(mappedBy="doctorList",fetch=FetchType.EAGER)
	private Set<Patient> patientList;
	
	@OneToOne(mappedBy="doctor")
	private User user;
	
	public Doctor() {
		
	}
	
}
