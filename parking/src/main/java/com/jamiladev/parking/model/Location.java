package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location_details")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationid;

	@Column(columnDefinition = "cityid")
	private Long cityid;

	@Column(columnDefinition = "pincode")
	private String pincode;

	@Column(columnDefinition = "locationname")
	private String locationname;

	public Long getLocationId() {
		return locationid;
	}

	public void setLocationId(Long locationid) {
		this.locationid = locationid;
	}

	public Long getCityId() {
		return cityid;
	}

	public void setCityId(Long cityid) {
		this.cityid = cityid;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLocationName() {
		return locationname;
	}

	public void setLocationName(String locationname) {
		this.locationname = locationname;
	}

}
