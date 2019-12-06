package com.cognizant.medicare_authentication.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pt_id")
	private  long patient_id;
	@Column(name="pt_first_name")
	private String firstname;
	@Column(name="pt_last_name")
	private String lastname;
	@Column(name="pt_age")
	private int age;
	@Column(name="pt_gender")
	private String gender;
	@Column(name="pt_date_of_birth")
	private Date dateOfBirth;
	@Column(name="pt_contact_no")
	private String contactNo;
	@Column(name="pt_alt_contact_no")
	private String altContactNo;
	@Column(name="pt_email")
	private String email;
	@Column(name="pt_password")
	private String password;
	@Column(name="pt_address_1")
	private String address_1;
	@Column(name="pt_address_2")
	private String address_2;
	@Column(name="pt_city")
	private String city;
	@Column(name="pt_state")
	private String state;
	@Column(name="pt_zip_code")
	private String zipCode;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="patient_doctor")
	private Set<Doctor> doctorList;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="patient_agent")
	private Set<Agent> agentList;
	
	@OneToOne(mappedBy = "patient")
	private User user;
	
	@OneToMany(mappedBy = "patient")
	private Set<Appointment> appointment;
	
	@OneToMany(mappedBy = "patient")
	private Set<MedicalTestHistory> medicalTestHistoryList;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="patient_medicare_services")
	private Set<MedicareServices> medicareServicesList;
	
	
	
	public Patient() {
		
	}
	
	
	
}
