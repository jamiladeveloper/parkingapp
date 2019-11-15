package com.jamiladev.parking.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_proof_details")
public class UserProofDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long proofid;

	@Column(columnDefinition = "prooftypeid")
	private Integer prooftypeid;

	@Column(columnDefinition = "proofnumber")
	private String proofnumber;

	@Column(columnDefinition = "proofpic")
	private String[] proofpic;

	@Column(columnDefinition = "userid")
	private Long userid;

	@Column(columnDefinition = "uploadedon")
	private Timestamp uploadedon;

	@Column(columnDefinition = "lastmodifiedon")
	private Timestamp lastmodifiedon;

	@Column(columnDefinition = "isdeleted")
	private Boolean isdeleted;

	public Long getProofId() {
		return proofid;
	}

	public void setProofId(Long proofid) {
		this.proofid = proofid;
	}

	public Integer getProofTypeId() {
		return prooftypeid;
	}

	public void setProofTypeId(Integer prooftypeid) {
		this.prooftypeid = prooftypeid;
	}

	public String getProofNumber() {
		return proofnumber;
	}

	public void setProofNumber(String proofnumber) {
		this.proofnumber = proofnumber;
	}

	public String[] getProofPic() {
		return proofpic;
	}

	public void setProofPic(String[] proofpic) {
		this.proofpic = proofpic;
	}

	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long userid) {
		this.userid = userid;
	}

	public Timestamp getUploadedOn() {
		return uploadedon;
	}

	public void setUploadedOn(Timestamp uploadedon) {
		this.uploadedon = uploadedon;
	}

	public Timestamp getLastModifiedOn() {
		return lastmodifiedon;
	}

	public void setLastModifiedOn(Timestamp lastmodifiedon) {
		this.lastmodifiedon = lastmodifiedon;
	}

	public Boolean getIsDeleted() {
		return isdeleted;
	}

	public void setIsDeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

}
