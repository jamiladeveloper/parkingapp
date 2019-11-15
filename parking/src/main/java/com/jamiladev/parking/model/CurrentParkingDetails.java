package com.jamiladev.parking.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "current_parking_details")
public class CurrentParkingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long currentparkingid;

	@Column(columnDefinition = "parkingspaceid")
	private Long parkingspaceid;

	@Column(columnDefinition = "parkeduserid")
	private Long parkeduserid;

	@Column(columnDefinition = "parkingstarttime")
	private Timestamp parkingstarttime;

	@Column(columnDefinition = "estimatedparkingendtime")
	private Timestamp estimatedparkingendtime;

	@Column(columnDefinition = "actualparkingendtime")
	private Timestamp actualparkingendtime;

	@Column(columnDefinition = "iscompleted")
	private Boolean iscompleted;

	@Column(columnDefinition = "parkerfeedbackid")
	private Long parkerfeedbackid;

	@Column(columnDefinition = "ownerfeedbackid")
	private Long ownerfeedbackid;

	@Column(columnDefinition = "totalcharges")
	private Integer totalcharges;

	@Column(columnDefinition = "paymentcompleted")
	private Boolean paymentcompleted;

	@Column(columnDefinition = "createdon")
	private Timestamp createdon;

	@Column(columnDefinition = "lastupdatedon")
	private Timestamp lastupdatedon;

	public Long getCurrentParkingId() {
		return currentparkingid;
	}

	public void setCurrentParkingId(Long currentparkingid) {
		this.currentparkingid = currentparkingid;
	}

	public Long getParkingSpaceId() {
		return parkingspaceid;
	}

	public void setParkingSpaceId(Long parkingspaceid) {
		this.parkingspaceid = parkingspaceid;
	}

	public Long getParkedUserId() {
		return parkeduserid;
	}

	public void setParkedUserId(Long parkeduserid) {
		this.parkeduserid = parkeduserid;
	}

	public Timestamp getParkingStartTime() {
		return parkingstarttime;
	}

	public void setParkingStartTime(Timestamp parkingstarttime) {
		this.parkingstarttime = parkingstarttime;
	}

	public Timestamp getEstimatedParkingEndTime() {
		return estimatedparkingendtime;
	}

	public void setEstimatedParkingEndTime(Timestamp estimatedparkingendtime) {
		this.estimatedparkingendtime = estimatedparkingendtime;
	}

	public Timestamp getActualParkingEndTime() {
		return actualparkingendtime;
	}

	public void setActualParkingEndTime(Timestamp actualparkingendtime) {
		this.actualparkingendtime = actualparkingendtime;
	}

	public Boolean getIsCompleted() {
		return iscompleted;
	}

	public void setIsCompleted(Boolean iscompleted) {
		this.iscompleted = iscompleted;
	}

	public Long getParkerFeedbackId() {
		return parkerfeedbackid;
	}

	public void setParkerFeedbackId(Long parkerfeedbackid) {
		this.parkerfeedbackid = parkerfeedbackid;
	}

	public Long getOwnerFeedbackId() {
		return ownerfeedbackid;
	}

	public void setOwnerFeedbackId(Long ownerfeedbackid) {
		this.ownerfeedbackid = ownerfeedbackid;
	}

	public Integer getTotalCharges() {
		return totalcharges;
	}

	public void setTotalCharges(Integer totalcharges) {
		this.totalcharges = totalcharges;
	}

	public Boolean getPaymentCompleted() {
		return paymentcompleted;
	}

	public void setPaymentCompleted(Boolean paymentcompleted) {
		this.paymentcompleted = paymentcompleted;
	}

	public Timestamp getCreatedOn() {
		return createdon;
	}

	public void setCreatedOn(Timestamp createdon) {
		this.createdon = createdon;
	}

	public Timestamp getLastUpdatedOn() {
		return lastupdatedon;
	}

	public void setLastUpdatedOn(Timestamp lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

}
