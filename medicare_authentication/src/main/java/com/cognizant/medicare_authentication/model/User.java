package com.cognizant.medicare_authentication.model;

import java.util.List;
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
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int userId;
	@Column(name = "us_user_name")
	private String username;
	
	@Column(name = "us_first_name")
	private String firstname;
	@Column(name = "us_last_name")
	private String lastname;
	@Column(name = "us_contact_no")
	private String contactNo;
	@Column(name = "us_role")
	private String role;
	@Column(name ="us_password")
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role")
	private Set<Role> roleList;
	
	@OneToMany(mappedBy="user")
	private List<UserFeedback> userfeedbackList;
	
	@OneToOne
	@JoinColumn(name="us_ad_id")
	private Admin admin;
	
	@OneToOne
	@JoinColumn(name="us_dr_id")
	private Doctor doctor;
	
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", contactNo=" + contactNo + ", role=" + role + ", password=" + password + ", roleList="
				+ roleList + "]";
	}

	public User(int userId, String username, String firstname, String lastname, String contactNo, String role,
			String password, Set<Role> roleList) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactNo = contactNo;
		this.role = role;
		this.password = password;
		this.roleList = roleList;
	}

	
	
}
