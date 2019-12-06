package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ad_id")
	private long admin_Id;
	@Column(name="ad_first_name")
	private String firstname;
	@Column(name="ad_last_name")
	private String lastname;
	@Column(name="ad_age")
	private int age;
	@Column(name="ad_gender")
	private String gender;
	@Column(name="ad_date_of_birth")
	private Date dateOfBirth;
	@Column(name="ad_contact_no")
	private String contactNo;
	@Column(name="ad_alt_contact_no")
	private String altContactNo;
	@Column(name="ad_email")
	private String email;
	@Column(name="ad_password")
	private String password;
	
	@OneToOne(mappedBy="admin")
	private User user;
	
	public Admin() {
		
	}
}
