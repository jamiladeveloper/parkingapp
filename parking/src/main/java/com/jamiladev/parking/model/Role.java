package com.jamiladev.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_details")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleid;

	@Column(columnDefinition = "rolename")
	private String rolename;

	public Integer getRoleId() {
		return roleid;
	}

	public void setRoleId(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRoleName() {
		return rolename;
	}

	public void setRoleName(String rolename) {
		this.rolename = rolename;
	}

}
