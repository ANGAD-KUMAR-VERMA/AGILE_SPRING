package com.cognizant.medicare_authentication.model;

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
	
	@ManyToOne
	@JoinColumn(name="uf_us_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="uf_fb_ass_id")
	private Feedback feedback;
	
	public UserFeedback() {
		
	}
	
}
