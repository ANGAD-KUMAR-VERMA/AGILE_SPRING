package com.cognizant.medicare_authentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_medicare_services")
public class PatientMedicareServices {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pms_id")
	private long id;
	@Column(name="pms_pt_id")
	private long patientId;
	@Column(name="pms_ms_id")
	private long medicareServiceId;
	
	public PatientMedicareServices() {
		
	}
}
