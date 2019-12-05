package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agent")
public class Agent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ag_id")
	private long agent_Id;
	@Column(name="ag_first_name")
	private String firstname;
	@Column(name="ag_last_name")
	private String lastname;
	@Column(name="ag_age")
	private int age;
	@Column(name="ag_gender")
	private String gender;
	@Column(name="ag_date_of_birth")
	private Date dateOfBirth;
	@Column(name="ag_contact_no")
	private String contactNo;
	@Column(name="ag_alt_contact_no")
	private String altContactNo;
	@Column(name="ag_email")
	private String email;
	@Column(name="ag_address_1")
	private String address_1;
	@Column(name="ag_address_2")
	private String address_2;
	@Column(name="ag_city")
	private String city;
	@Column(name="ag_state")
	private String state;
	@Column(name="ag_zip_code")
	private String zipCode;
	
	public Agent() {
		
	}
}
