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
}
