package com.cognizant.medicare_authentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fb_ass_id")
	private long assessmentId;
	@Column(name="fb_que_1")
	private String que_1;
	@Column(name="fb_que_2")
	private String que_2;
	@Column(name="fb_que_3")
	private String que_3;
	@Column(name="fb_que_4")
	private String que_4;
	@Column(name="fb_que_5")
	private String que_5;
	@Column(name="fb_que_6")
	private String que_6;
	@Column(name="fb_que_7")
	private String que_7;
	@Column(name="fb_que_8")
	private String que_8;
	@Column(name="fb_que_9")
	private String que_9;
	@Column(name="fb_que_10")
	private String que_10;
	
	@OneToOne(mappedBy="feedback")
	private UserFeedback userFeedback;
	
	public  Feedback() {
	}

	public long getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(long assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getQue_1() {
		return que_1;
	}

	public void setQue_1(String que_1) {
		this.que_1 = que_1;
	}

	public String getQue_2() {
		return que_2;
	}

	public void setQue_2(String que_2) {
		this.que_2 = que_2;
	}

	public String getQue_3() {
		return que_3;
	}

	public void setQue_3(String que_3) {
		this.que_3 = que_3;
	}

	public String getQue_4() {
		return que_4;
	}

	public void setQue_4(String que_4) {
		this.que_4 = que_4;
	}

	public String getQue_5() {
		return que_5;
	}

	public void setQue_5(String que_5) {
		this.que_5 = que_5;
	}

	public String getQue_6() {
		return que_6;
	}

	public void setQue_6(String que_6) {
		this.que_6 = que_6;
	}

	public String getQue_7() {
		return que_7;
	}

	public void setQue_7(String que_7) {
		this.que_7 = que_7;
	}

	public String getQue_8() {
		return que_8;
	}

	public void setQue_8(String que_8) {
		this.que_8 = que_8;
	}

	public String getQue_9() {
		return que_9;
	}

	public void setQue_9(String que_9) {
		this.que_9 = que_9;
	}

	public String getQue_10() {
		return que_10;
	}

	public void setQue_10(String que_10) {
		this.que_10 = que_10;
	}

	public UserFeedback getUserFeedback() {
		return userFeedback;
	}

	public void setUserFeedback(UserFeedback userFeedback) {
		this.userFeedback = userFeedback;
	}

	public Feedback(long assessmentId, String que_1, String que_2, String que_3, String que_4, String que_5,
			String que_6, String que_7, String que_8, String que_9, String que_10, UserFeedback userFeedback) {
		super();
		this.assessmentId = assessmentId;
		this.que_1 = que_1;
		this.que_2 = que_2;
		this.que_3 = que_3;
		this.que_4 = que_4;
		this.que_5 = que_5;
		this.que_6 = que_6;
		this.que_7 = que_7;
		this.que_8 = que_8;
		this.que_9 = que_9;
		this.que_10 = que_10;
		this.userFeedback = userFeedback;
	}

	@Override
	public String toString() {
		return "Feedback [assessmentId=" + assessmentId + ", que_1=" + que_1 + ", que_2=" + que_2 + ", que_3=" + que_3
				+ ", que_4=" + que_4 + ", que_5=" + que_5 + ", que_6=" + que_6 + ", que_7=" + que_7 + ", que_8=" + que_8
				+ ", que_9=" + que_9 + ", que_10=" + que_10 + ", userFeedback=" + userFeedback + "]";
	}
	
	
}
