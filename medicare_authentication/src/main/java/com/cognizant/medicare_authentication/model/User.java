package com.cognizant.medicare_authentication.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int userId;
	@Column(name = "us_user_name")
	private String username;
	
	
	@Column(name ="us_password")
	private String password;
	@Column(name ="us_status")
	private Boolean status;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name="ur_us_id"),inverseJoinColumns = @JoinColumn(name="ur_ro_id"))
	private Set<Role> roleList;
	
	//@OneToMany(mappedBy="user")
	//private List<UserFeedback> userfeedbackList;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="us_ad_id")
	private Admin admin;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="us_dr_id")
	private Doctor doctor;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="us_pt_id")
	private Patient patient;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="us_ag_id")
	private Agent agent;
	
	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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

	public User(int userId, String username, String password, Boolean status, Set<Role> roleList, Admin admin,
			Doctor doctor, Patient patient, Agent agent) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.status = status;
		this.roleList = roleList;
		this.admin = admin;
		this.doctor = doctor;
		this.patient = patient;
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", status=" + status
				+ ", roleList=" + roleList + ", admin=" + admin + ", doctor=" + doctor + ", patient=" + patient
				+ ", agent=" + agent + "]";
	}

	
	
}
