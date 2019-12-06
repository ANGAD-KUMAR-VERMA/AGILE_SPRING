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
	private long medicareServiceId;
	@Column(name="ms_medicare_service")
	private String medicareService;
	@Column(name="ms_service_desc")
	private String serviceDescription;
	@Column(name="ms_amount")
	private double amount;
	
	@JsonIgnore
	@ManyToMany(mappedBy="medicareServicesList",fetch=FetchType.EAGER)
	private Set<Patient> patientList;
	
	public MedicareServices() {
		
	}
}
