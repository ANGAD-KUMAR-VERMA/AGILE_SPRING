package com.cognizant.medicare_authentication.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="medicare_services")
public class MedicareServices {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ms_id")
	private long id;
	@Column(name="ms_medicare_service")
	private String medicareService;
	@Column(name="ms_service_desc")
	private String serviceDescription;
	@Column(name="ms_amount")
	private double amount;
	
	@JsonIgnore
	@ManyToMany(mappedBy="medicareServicesList",fetch=FetchType.EAGER)
	private Set<Doctor> doctorList;
	
	public MedicareServices() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicareService() {
		return medicareService;
	}

	public void setMedicareService(String medicareService) {
		this.medicareService = medicareService;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Set<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(Set<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public MedicareServices(long id, String medicareService, String serviceDescription, double amount,
			Set<Doctor> doctorList) {
		super();
		this.id = id;
		this.medicareService = medicareService;
		this.serviceDescription = serviceDescription;
		this.amount = amount;
		this.doctorList = doctorList;
	}

	@Override
	public String toString() {
		return "MedicareServices [id=" + id + ", medicareService=" + medicareService + ", serviceDescription="
				+ serviceDescription + ", amount=" + amount + ", doctorList=" + doctorList + "]";
	}


}
