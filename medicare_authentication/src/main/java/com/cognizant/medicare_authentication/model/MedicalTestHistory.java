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

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getAgentId() {
		return agentId;
	}

	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Date getTestResultDate() {
		return testResultDate;
	}

	public void setTestResultDate(Date testResultDate) {
		this.testResultDate = testResultDate;
	}

	public double getDiagActualValue_1() {
		return diagActualValue_1;
	}

	public void setDiagActualValue_1(double diagActualValue_1) {
		this.diagActualValue_1 = diagActualValue_1;
	}

	public double getDiagNormalRange_1() {
		return diagNormalRange_1;
	}

	public void setDiagNormalRange_1(double diagNormalRange_1) {
		this.diagNormalRange_1 = diagNormalRange_1;
	}

	public double getDiagActualValue_2() {
		return diagActualValue_2;
	}

	public void setDiagActualValue_2(double diagActualValue_2) {
		this.diagActualValue_2 = diagActualValue_2;
	}

	public double getDiagNormalRange_2() {
		return diagNormalRange_2;
	}

	public void setDiagNormalRange_2(double diagNormalRange_2) {
		this.diagNormalRange_2 = diagNormalRange_2;
	}

	public double getDiagActualValue_3() {
		return diagActualValue_3;
	}

	public void setDiagActualValue_3(double diagActualValue_3) {
		this.diagActualValue_3 = diagActualValue_3;
	}

	public double getDiagNormalRange_3() {
		return diagNormalRange_3;
	}

	public void setDiagNormalRange_3(double diagNormalRange_3) {
		this.diagNormalRange_3 = diagNormalRange_3;
	}

	public double getDiagActualValue_4() {
		return diagActualValue_4;
	}

	public void setDiagActualValue_4(double diagActualValue_4) {
		this.diagActualValue_4 = diagActualValue_4;
	}

	public double getDiagNormalRange_4() {
		return diagNormalRange_4;
	}

	public void setDiagNormalRange_4(double diagNormalRange_4) {
		this.diagNormalRange_4 = diagNormalRange_4;
	}

	public double getDiagActualValue_5() {
		return diagActualValue_5;
	}

	public void setDiagActualValue_5(double diagActualValue_5) {
		this.diagActualValue_5 = diagActualValue_5;
	}

	public double getDiagNormalRange_5() {
		return diagNormalRange_5;
	}

	public void setDiagNormalRange_5(double diagNormalRange_5) {
		this.diagNormalRange_5 = diagNormalRange_5;
	}

	public double getDiagActualValue_6() {
		return diagActualValue_6;
	}

	public void setDiagActualValue_6(double diagActualValue_6) {
		this.diagActualValue_6 = diagActualValue_6;
	}

	public double getDiagNormalRange_6() {
		return diagNormalRange_6;
	}

	public void setDiagNormalRange_6(double diagNormalRange_6) {
		this.diagNormalRange_6 = diagNormalRange_6;
	}

	public String getDoctorComments() {
		return doctorComments;
	}

	public void setDoctorComments(String doctorComments) {
		this.doctorComments = doctorComments;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public MedicalTestHistory(long reportId, long customerId, long doctorId, long agentId, Date serviceDate,
			Date testResultDate, double diagActualValue_1, double diagNormalRange_1, double diagActualValue_2,
			double diagNormalRange_2, double diagActualValue_3, double diagNormalRange_3, double diagActualValue_4,
			double diagNormalRange_4, double diagActualValue_5, double diagNormalRange_5, double diagActualValue_6,
			double diagNormalRange_6, String doctorComments, String otherInfo, Patient patient) {
		super();
		this.reportId = reportId;
		this.customerId = customerId;
		this.doctorId = doctorId;
		this.agentId = agentId;
		this.serviceDate = serviceDate;
		this.testResultDate = testResultDate;
		this.diagActualValue_1 = diagActualValue_1;
		this.diagNormalRange_1 = diagNormalRange_1;
		this.diagActualValue_2 = diagActualValue_2;
		this.diagNormalRange_2 = diagNormalRange_2;
		this.diagActualValue_3 = diagActualValue_3;
		this.diagNormalRange_3 = diagNormalRange_3;
		this.diagActualValue_4 = diagActualValue_4;
		this.diagNormalRange_4 = diagNormalRange_4;
		this.diagActualValue_5 = diagActualValue_5;
		this.diagNormalRange_5 = diagNormalRange_5;
		this.diagActualValue_6 = diagActualValue_6;
		this.diagNormalRange_6 = diagNormalRange_6;
		this.doctorComments = doctorComments;
		this.otherInfo = otherInfo;
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "MedicalTestHistory [reportId=" + reportId + ", customerId=" + customerId + ", doctorId=" + doctorId
				+ ", agentId=" + agentId + ", serviceDate=" + serviceDate + ", testResultDate=" + testResultDate
				+ ", diagActualValue_1=" + diagActualValue_1 + ", diagNormalRange_1=" + diagNormalRange_1
				+ ", diagActualValue_2=" + diagActualValue_2 + ", diagNormalRange_2=" + diagNormalRange_2
				+ ", diagActualValue_3=" + diagActualValue_3 + ", diagNormalRange_3=" + diagNormalRange_3
				+ ", diagActualValue_4=" + diagActualValue_4 + ", diagNormalRange_4=" + diagNormalRange_4
				+ ", diagActualValue_5=" + diagActualValue_5 + ", diagNormalRange_5=" + diagNormalRange_5
				+ ", diagActualValue_6=" + diagActualValue_6 + ", diagNormalRange_6=" + diagNormalRange_6
				+ ", doctorComments=" + doctorComments + ", otherInfo=" + otherInfo + ", patient=" + patient + "]";
	}
	
	
	
	
}
