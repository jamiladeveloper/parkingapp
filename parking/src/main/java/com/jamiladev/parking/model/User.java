package com.jamiladev.parking.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;

	@Column(columnDefinition = "username")
	private String username;

	@Column(columnDefinition = "usermobile")
	private String usermobile;

	@Column(columnDefinition = "useremail")
	private String useremail;

	@Column(columnDefinition = "useraddress")
	private String useraddress;

	@Column(columnDefinition = "userlocationid")
	private Long userlocationid;

	@Column(columnDefinition = "userpwd")
	private String userpwd;

	@Column(columnDefinition = "userpic")
	private String[] userpic;

	@Column(columnDefinition = "createdon")
	private Timestamp createdon;

	@Column(columnDefinition = "isverified")
	private Boolean isverified;

	@Column(columnDefinition = "isdeleted")
	private Boolean isdeleted;

	@Column(columnDefinition = "averageratingid")
	private Integer averageratingid;

	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getUserMobile() {
		return usermobile;
	}

	public void setUserMobile(String usermobile) {
		this.usermobile = usermobile;
	}

	public String getUserEmail() {
		return useremail;
	}

	public void setUserEmail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserAddress() {
		return useraddress;
	}

	public void setUserAddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public Long getUserLocationId() {
		return userlocationid;
	}

	public void setUserLocationId(Long userlocationid) {
		this.userlocationid = userlocationid;
	}

	public String getUserPwd() {
		return userpwd;
	}

	public void setUserPwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String[] getUserPic() {
		return userpic;
	}

	public void setUserPic(String[] userpic) {
		this.userpic = userpic;
	}

	public Timestamp getCreatedOn() {
		return createdon;
	}

	public void setCreatedOn(Timestamp createdon) {
		this.createdon = createdon;
	}

	public Boolean getIsVerified() {
		return isverified;
	}

	public void setIsVerified(Boolean isverified) {
		this.isverified = isverified;
	}

	public Boolean getIsDeleted() {
		return isdeleted;
	}

	public void setIsDeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public Integer getAverageRatingId() {
		return averageratingid;
	}

	public void setAverageRatingId(Integer averageratingid) {
		this.averageratingid = averageratingid;
	}

}
