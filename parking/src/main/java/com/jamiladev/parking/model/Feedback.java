package com.jamiladev.parking.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback_details")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long feedbackid;

	@Column(columnDefinition = "feedbackprovider")
	private Long feedbackprovider;

	@Column(columnDefinition = "feedbackprovidedto")
	private Long feedbackprovidedto;

	@Column(columnDefinition = "submittedon")
	private Timestamp submittedon;

	@Column(columnDefinition = "feedbackpics")
	private String[] feedbackpics;

	@Column(columnDefinition = "feedbacktext")
	private String feedbacktext;

	@Column(columnDefinition = "ratingid")
	private Integer ratingid;

	public Long getFeedbackId() {
		return feedbackid;
	}

	public void setFeedbackId(Long feedbackid) {
		this.feedbackid = feedbackid;
	}

	public Long getFeedbackProvider() {
		return feedbackprovider;
	}

	public void setFeedbackProvider(Long feedbackprovider) {
		this.feedbackprovider = feedbackprovider;
	}

	public Long getFeedbackProvidedTo() {
		return feedbackprovidedto;
	}

	public void setFeedbackProvidedTo(Long feedbackprovidedto) {
		this.feedbackprovidedto = feedbackprovidedto;
	}

	public Timestamp getSubmittedOn() {
		return submittedon;
	}

	public void setSubmittedOn(Timestamp submittedon) {
		this.submittedon = submittedon;
	}

	public String[] getFeedbackPics() {
		return feedbackpics;
	}

	public void setFeedbackPics(String[] feedbackpics) {
		this.feedbackpics = feedbackpics;
	}

	public String getFeedbackText() {
		return feedbacktext;
	}

	public void setFeedbackText(String feedbacktext) {
		this.feedbacktext = feedbacktext;
	}

	public Integer getRatingId() {
		return ratingid;
	}

	public void setRatingId(Integer ratingid) {
		this.ratingid = ratingid;
	}

}
