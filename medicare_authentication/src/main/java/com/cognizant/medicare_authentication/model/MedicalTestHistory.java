package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medical_test_history")
public class MedicalTestHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mt_report_id")
	private long reportId;
	@Column(name="mt_customer_id")
	private long customerId;
	@Column(name="mt_doctor_id")
	private long doctorId;
	@Column(name="mt_agent_id")
	private long agentId;
	@Column(name="mt_service_date")
	private Date serviceDate;
	@Column(name="mt_test_result_date")
	private Date testResultDate;
	@Column(name="mt_dav_1")
	private double diagActualValue_1;
	@Column(name="mt_dnr_1")
	private double diagNormalRange_1;
	@Column(name="mt_dav_2")
	private double diagActualValue_2;
	@Column(name="mt_dnr_2")
	private double diagNormalRange_2;
	@Column(name="mt_dav_3")
	private double diagActualValue_3;
	@Column(name="mt_dnr_3")
	private double diagNormalRange_3;
	@Column(name="mt_dav_4")
	private double diagActualValue_4;
	@Column(name="mt_dnr_4")
	private double diagNormalRange_4;
	@Column(name="mt_dav_5")
	private double diagActualValue_5;
	@Column(name="mt_dnr_5")
	private double diagNormalRange_5;
	@Column(name="mt_dav_6")
	private double diagActualValue_6;
	@Column(name="mt_dnr_6")
	private double diagNormalRange_6;
	@Column(name="mt_doctor_comments")
	private String doctorComments;
	@Column(name="mt_other_info")
	private String otherInfo;
	
	@ManyToOne
	@JoinColumn(name = "mt_pt_id")
	private Patient patient;
	
	public MedicalTestHistory() {
		
	}
	
	
	
}
