package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_details")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryid;
	
	@Column(columnDefinition = "countryname")
	private String countryname;
	
	@Column(columnDefinition = "countrycode")
	private String countrycode;
	
	@Column(columnDefinition = "countryphonecode")
	private String countryphonecode;

	public Long getCountryId() {
		return countryid;
	}

	public void setCountryId(Long countryid) {
		this.countryid = countryid;
	}

	public String getCountryName() {
		return countryname;
	}

	public void setCountryName(String countryname) {
		this.countryname = countryname;
	}

	public String getCountryCode() {
		return countrycode;
	}

	public void setCountryCode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCountryPhoneCode() {
		return countryphonecode;
	}

	public void setCountryPhoneCode(String countryphonecode) {
		this.countryphonecode = countryphonecode;
	}
	
	
	
}
