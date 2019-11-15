package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking_space_details")
public class ParkingSpace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long parkingspaceid;
	
	@Column(columnDefinition = "userid")
	private Long userid;
	
	@Column(columnDefinition = "parkingspacename")
	private String parkingspacename;
	
	@Column(columnDefinition = "parkingspacepics")
	private String[] parkingspacepics;
	
	@Column(columnDefinition = "parkingspaceavailable")
	private Boolean parkingspaceavailable;
	
	@Column(columnDefinition = "bikecharges")
	private Integer bikecharges;
	
	@Column(columnDefinition = "carcharges")
	private Integer carcharges;
	
	@Column(columnDefinition = "isowneraddress")
	private Boolean isowneraddress;
	
	@Column(columnDefinition = "parkingspaceaddress")
	private String parkingspaceaddress;
	
	@Column(columnDefinition = "parkingspacelocationid")
	private Long parkingspacelocationid;
	
	@Column(columnDefinition = "averageratingid")
	private Integer averageratingid;
	
	@Column(columnDefinition = "latitude")
	private String latitude;
	
	@Column(columnDefinition = "longitude")
	private String longitude;

	public Long getParkingSpaceId() {
		return parkingspaceid;
	}

	public void setParkingSpaceId(Long parkingspaceid) {
		this.parkingspaceid = parkingspaceid;
	}

	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long userid) {
		this.userid = userid;
	}

	public String getParkingSpaceName() {
		return parkingspacename;
	}

	public void setParkingSpaceName(String parkingspacename) {
		this.parkingspacename = parkingspacename;
	}

	public String[] getParkingSpacePics() {
		return parkingspacepics;
	}

	public void setParkingSpacePics(String[] parkingspacepics) {
		this.parkingspacepics = parkingspacepics;
	}

	public Boolean getParkingSpaceAvailable() {
		return parkingspaceavailable;
	}

	public void setParkingSpaceAvailable(Boolean parkingspaceavailable) {
		this.parkingspaceavailable = parkingspaceavailable;
	}

	public Integer getBikeCharges() {
		return bikecharges;
	}

	public void setBikeCharges(Integer bikecharges) {
		this.bikecharges = bikecharges;
	}

	public Integer getCarCharges() {
		return carcharges;
	}

	public void setCarCharges(Integer carcharges) {
		this.carcharges = carcharges;
	}

	public Boolean getIsOwnerAddress() {
		return isowneraddress;
	}

	public void setIsOwnerAddress(Boolean isowneraddress) {
		this.isowneraddress = isowneraddress;
	}

	public String getParkingSpaceAddress() {
		return parkingspaceaddress;
	}

	public void setParkingSpaceAddress(String parkingspaceaddress) {
		this.parkingspaceaddress = parkingspaceaddress;
	}

	public Long getParkingSpaceLocationId() {
		return parkingspacelocationid;
	}

	public void setParkingSpaceLocationId(Long parkingspacelocationid) {
		this.parkingspacelocationid = parkingspacelocationid;
	}

	public Integer getAverageRatingId() {
		return averageratingid;
	}

	public void setAverageRatingId(Integer averageratingid) {
		this.averageratingid = averageratingid;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
	
}
