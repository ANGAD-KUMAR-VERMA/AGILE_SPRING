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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="agent")
public class Agent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ag_id")
	private long id;
	@Column(name = "ag_username")
	private String username;
	@Column(name="ag_first_name")
	private String firstname;
	@Column(name="ag_last_name")
	private String lastname;
	@Column(name = "ag_password")
	private String password;
	@Column(name="ag_age")
	private String age;
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
	private String address1;
	@Column(name="ag_address_2")
	private String address2;
	@Column(name="ag_city")
	private String city;
	@Column(name="ag_state")
	private String state;
	@Column(name="ag_zip_code")
	private String zipcode;
	@Column(name="ag_status")
	private boolean status;
	
	
	@JsonIgnore
	@ManyToMany(mappedBy="agentList",fetch=FetchType.EAGER)
	private Set<Patient> patientList;
	
	@OneToMany(mappedBy = "agent")
	private Set<Appointment> appointment;
	
	@JsonIgnore
	@OneToOne(mappedBy = "agent")
	private User user;
	
	public Agent() {
		
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}

	public Set<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", age=" + age + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", contactNo=" + contactNo + ", altContactNo=" + altContactNo + ", email=" + email + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", status=" + status + ", patientList=" + patientList + ", appointment=" + appointment + ", user="
				+ user + "]";
	}

	public Agent(long id, String username, String firstname, String lastname, String password, String age,
			String gender, Date dateOfBirth, String contactNo, String altContactNo, String email, String address1,
			String address2, String city, String state, String zipcode, boolean status, Set<Patient> patientList,
			Set<Appointment> appointment, User user) {
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
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.status = status;
		this.patientList = patientList;
		this.appointment = appointment;
		this.user = user;
	}

	
}
