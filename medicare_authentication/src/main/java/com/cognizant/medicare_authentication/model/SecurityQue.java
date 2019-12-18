package com.cognizant.medicare_authentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forgot_password")
public class SecurityQue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	 private long id;
	@Column(name = "que")
	 private String que;
	
	public SecurityQue() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public SecurityQue(long id, String que) {
		super();
		this.id = id;
		this.que = que;
	}

	@Override
	public String toString() {
		return "ForgotPassword [id=" + id + ", que=" + que + "]";
	}
	
	
	
	
}
