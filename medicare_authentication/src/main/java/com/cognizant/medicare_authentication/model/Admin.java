package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ad_id")
	private long id;
	@Column(name="ad_username")
	private String username;
	@Column(name="ad_first_name")
	private String firstname;
	@Column(name="ad_last_name")
	private String lastname;
	@Column(name = "ad_password")
	private String password;
	@Column(name="ad_age")
	private String age;
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
	@Column(name="ad_status")
	private boolean status;
	
	@JsonIgnore
	@OneToOne(mappedBy="admin")
	private User user;
	
	public Admin() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAltContactNo() {
		return altContactNo;
	}

	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin(long id, String username, String firstname, String lastname, String password, String age,
			String gender, Date dateOfBirth, String contactNo, String altContactNo, String email, boolean status,
			User user) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
		this.altContactNo = altContactNo;
		this.email = email;
		this.status = status;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", age=" + age + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", contactNo=" + contactNo + ", altContactNo=" + altContactNo + ", email=" + email + ", status="
				+ status + ", user=" + user + "]";
	}


}
