package com.jamiladev.parking.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {

	private static final long serialVersionUID = 7174323137498694677L;

	@Id
	private Long userid;

	@Id
	private Integer roleid;

	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long userid) {
		this.userid = userid;
	}

	public Integer getRoleId() {
		return roleid;
	}

	public void setRoleId(Integer roleid) {
		this.roleid = roleid;
	}

}
