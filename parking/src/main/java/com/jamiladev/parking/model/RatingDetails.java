package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating_details")
public class RatingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ratingid;

	@Column(columnDefinition = "ratingtext")
	private String ratingtext;

	public Integer getRatingId() {
		return ratingid;
	}

	public void setRatingId(Integer ratingid) {
		this.ratingid = ratingid;
	}

	public String getRatingText() {
		return ratingtext;
	}

	public void setRatingText(String ratingtext) {
		this.ratingtext = ratingtext;
	}

}
