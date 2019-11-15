package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proof_type_details")
public class ProofType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prooftypeid;

	@Column(columnDefinition = "prooftypetext")
	private String prooftypetext;

	public Integer getProofTypeId() {
		return prooftypeid;
	}

	public void setProofTypeId(Integer prooftypeid) {
		this.prooftypeid = prooftypeid;
	}

	public String getProofTypeText() {
		return prooftypetext;
	}

	public void setProofTypeText(String prooftypetext) {
		this.prooftypetext = prooftypetext;
	}

}
