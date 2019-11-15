package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission_details")
public class CommissionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commissionid;

	@Column(columnDefinition = "bikecommissionrate")
	private Integer bikecommissionrate;

	@Column(columnDefinition = "carcommissionrate")
	private Integer carcommissionrate;

	@Column(columnDefinition = "commissionlocationid")
	private Long commissionlocationid;

	public Long getCommissionId() {
		return commissionid;
	}

	public void setCommissionId(Long commissionid) {
		this.commissionid = commissionid;
	}

	public Integer getBikeCommissionRate() {
		return bikecommissionrate;
	}

	public void setBikeCommissionRate(Integer bikecommissionrate) {
		this.bikecommissionrate = bikecommissionrate;
	}

	public Integer getCarCommissionRate() {
		return carcommissionrate;
	}

	public void setCarCommissionRate(Integer carcommissionrate) {
		this.carcommissionrate = carcommissionrate;
	}

	public Long getCommissionLocationId() {
		return commissionlocationid;
	}

	public void setCommissionLocationId(Long commissionlocationid) {
		this.commissionlocationid = commissionlocationid;
	}

}
