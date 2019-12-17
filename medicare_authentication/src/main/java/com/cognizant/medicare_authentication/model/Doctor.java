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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dr_id")
	private long id;
	@Column(name = "dr_username")
	private String username;
	@Column(name="dr_first_name")
	private String firstname;
	@Column(name="dr_last_name")
	private String lastname;
	@Column(name = "dr_password")
	private String password;
	@Column(name="dr_age")
	private String age;
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
	private String address1;
	@Column(name="dr_address_2")
	private String address2;
	@Column(name="dr_city")
	private String city;
	@Column(name="dr_state")
	private String state;
	@Column(name="dr_zip_code")
	private String zipcode;
	@Column(name="dr_degree")
	private String degree;
	@Column(name="dr_speciality")
	private String speciality;
	@Column(name="dr_work_hours")
	private String workhours;
	@Column(name="dr_hospital_name")
	private String hospitalname;
	@Column(name="dr_medicare_service_id")
	private long medicareServiceId;
	@Column(name="dr_status", columnDefinition="boolean default false")
	private boolean status;
	
	
	@JsonIgnore
	@OneToOne(mappedBy="doctor")
	private User user;
	
	@JsonIgnore
	 @OneToMany(mappedBy = "doctor")
	private Set<Appointment> appointmentList;
	 
	 @ManyToMany(fetch=FetchType.EAGER)
		@JoinTable(name="patient_medicare_services")
		private Set<MedicareServices> medicareServicesList;
	
	public Doctor() {
		
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getWorkhours() {
		return workhours;
	}

	public void setWorkhours(String workhours) {
		this.workhours = workhours;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public long getMedicareServiceId() {
		return medicareServiceId;
	}

	public void setMedicareServiceId(long medicareServiceId) {
		this.medicareServiceId = medicareServiceId;
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

	public Set<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(Set<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public Set<MedicareServices> getMedicareServicesList() {
		return medicareServicesList;
	}

	public void setMedicareServicesList(Set<MedicareServices> medicareServicesList) {
		this.medicareServicesList = medicareServicesList;
	}

	public Doctor(long id, String username, String firstname, String lastname, String password, String age,
			String gender, Date dateOfBirth, String contactNo, String altContactNo, String email, String address1,
			String address2, String city, String state, String zipcode, String degree, String speciality,
			String workhours, String hospitalname, long medicareServiceId, boolean status, User user,
			Set<Appointment> appointmentList, Set<MedicareServices> medicareServicesList) {
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
		this.degree = degree;
		this.speciality = speciality;
		this.workhours = workhours;
		this.hospitalname = hospitalname;
		this.medicareServiceId = medicareServiceId;
		this.status = status;
		this.user = user;
		this.appointmentList = appointmentList;
		this.medicareServicesList = medicareServicesList;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", age=" + age + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", contactNo=" + contactNo + ", altContactNo=" + altContactNo + ", email=" + email + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", degree=" + degree + ", speciality=" + speciality + ", workhours=" + workhours + ", hospitalname="
				+ hospitalname + ", medicareServiceId=" + medicareServiceId + ", status=" + status + ", user=" + user
				+ ", appointmentList=" + appointmentList + ", medicareServicesList=" + medicareServicesList + "]";
	}

	
    
}
