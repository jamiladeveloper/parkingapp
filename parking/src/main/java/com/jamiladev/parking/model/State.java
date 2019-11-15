package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_details")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stateid;
	
	@Column(columnDefinition = "statename")
	private String statename;
	
	@Column(columnDefinition = "countryid")
	private Long countryid;

	public Long getStateId() {
		return stateid;
	}

	public void setStateId(Long stateid) {
		this.stateid = stateid;
	}

	public String getStateName() {
		return statename;
	}

	public void setStateName(String statename) {
		this.statename = statename;
	}

	public Long getCountryId() {
		return countryid;
	}

	public void setCountryId(Long countryid) {
		this.countryid = countryid;
	}
	
	
	
}
