package com.cognizant.medicare_authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_feedback")
public class UserFeedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uf_us_id")
	private long userId;
	@Column(name="uf_ass_id")
	private long assessmentId;
	@Column(name = "uf_doc_id")
	private long doctorId;
	@Column(name = "uf_pat_id")
	private long patientId;
	@Column(name = "uf_app_id")
	private long appointmentId;
	@Column(name="uf_rating_que_1")
	private String ratingQue_1;
	@Column(name="uf_rating_que_2")
	private String ratingQue_2;
	@Column(name="uf_rating_que_3")
	private String ratingQue_3;
	@Column(name="uf_rating_que_4")
	private String ratingQue_4;
	@Column(name="uf_rating_que_5")
	private String ratingQue_5;
	@Column(name="uf_rating_que_6")
	private String ratingQue_6;
	@Column(name="uf_rating_que_7")
	private String ratingQue_7;
	@Column(name="uf_rating_que_8")
	private String ratingQue_8;
	@Column(name="uf_rating_que_9")
	private String ratingQue_9;
	@Column(name="uf_rating_que_10")
	private String ratingQue_10;
	@Column(name="uf_assess_date")
	private Date assessmentDate;
	
	
	@OneToOne
	@JoinColumn(name="uf_fb_ass_id")
	private Feedback feedback;
	
	public UserFeedback() {
		
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(long assessmentId) {
		this.assessmentId = assessmentId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getRatingQue_1() {
		return ratingQue_1;
	}

	public void setRatingQue_1(String ratingQue_1) {
		this.ratingQue_1 = ratingQue_1;
	}

	public String getRatingQue_2() {
		return ratingQue_2;
	}

	public void setRatingQue_2(String ratingQue_2) {
		this.ratingQue_2 = ratingQue_2;
	}

	public String getRatingQue_3() {
		return ratingQue_3;
	}

	public void setRatingQue_3(String ratingQue_3) {
		this.ratingQue_3 = ratingQue_3;
	}

	public String getRatingQue_4() {
		return ratingQue_4;
	}

	public void setRatingQue_4(String ratingQue_4) {
		this.ratingQue_4 = ratingQue_4;
	}

	public String getRatingQue_5() {
		return ratingQue_5;
	}

	public void setRatingQue_5(String ratingQue_5) {
		this.ratingQue_5 = ratingQue_5;
	}

	public String getRatingQue_6() {
		return ratingQue_6;
	}

	public void setRatingQue_6(String ratingQue_6) {
		this.ratingQue_6 = ratingQue_6;
	}

	public String getRatingQue_7() {
		return ratingQue_7;
	}

	public void setRatingQue_7(String ratingQue_7) {
		this.ratingQue_7 = ratingQue_7;
	}

	public String getRatingQue_8() {
		return ratingQue_8;
	}

	public void setRatingQue_8(String ratingQue_8) {
		this.ratingQue_8 = ratingQue_8;
	}

	public String getRatingQue_9() {
		return ratingQue_9;
	}

	public void setRatingQue_9(String ratingQue_9) {
		this.ratingQue_9 = ratingQue_9;
	}

	public String getRatingQue_10() {
		return ratingQue_10;
	}

	public void setRatingQue_10(String ratingQue_10) {
		this.ratingQue_10 = ratingQue_10;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public UserFeedback(long userId, long assessmentId, long doctorId, long patientId, long appointmentId,
			String ratingQue_1, String ratingQue_2, String ratingQue_3, String ratingQue_4, String ratingQue_5,
			String ratingQue_6, String ratingQue_7, String ratingQue_8, String ratingQue_9, String ratingQue_10,
			Date assessmentDate, Feedback feedback) {
		super();
		this.userId = userId;
		this.assessmentId = assessmentId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.appointmentId = appointmentId;
		this.ratingQue_1 = ratingQue_1;
		this.ratingQue_2 = ratingQue_2;
		this.ratingQue_3 = ratingQue_3;
		this.ratingQue_4 = ratingQue_4;
		this.ratingQue_5 = ratingQue_5;
		this.ratingQue_6 = ratingQue_6;
		this.ratingQue_7 = ratingQue_7;
		this.ratingQue_8 = ratingQue_8;
		this.ratingQue_9 = ratingQue_9;
		this.ratingQue_10 = ratingQue_10;
		this.assessmentDate = assessmentDate;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "UserFeedback [userId=" + userId + ", assessmentId=" + assessmentId + ", doctorId=" + doctorId
				+ ", patientId=" + patientId + ", appointmentId=" + appointmentId + ", ratingQue_1=" + ratingQue_1
				+ ", ratingQue_2=" + ratingQue_2 + ", ratingQue_3=" + ratingQue_3 + ", ratingQue_4=" + ratingQue_4
				+ ", ratingQue_5=" + ratingQue_5 + ", ratingQue_6=" + ratingQue_6 + ", ratingQue_7=" + ratingQue_7
				+ ", ratingQue_8=" + ratingQue_8 + ", ratingQue_9=" + ratingQue_9 + ", ratingQue_10=" + ratingQue_10
				+ ", assessmentDate=" + assessmentDate + ", feedback=" + feedback + "]";
	}
	
}
