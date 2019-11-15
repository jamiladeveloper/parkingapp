package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_details")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cityid;
	
	@Column(columnDefinition = "stateid")
	private Long stateid;
	
	@Column(columnDefinition = "cityname")
	private String cityname;

	public Long getCityId() {
		return cityid;
	}

	public void setCityId(Long cityid) {
		this.cityid = cityid;
	}

	public Long getStateId() {
		return stateid;
	}

	public void setStateId(Long stateid) {
		this.stateid = stateid;
	}

	public String getCityName() {
		return cityname;
	}

	public void setCityName(String cityname) {
		this.cityname = cityname;
	}
	
	
	
	
}
