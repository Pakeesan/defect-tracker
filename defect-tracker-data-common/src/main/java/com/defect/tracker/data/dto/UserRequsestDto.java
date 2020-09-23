package com.defect.tracker.data.dto;

import java.util.List;

public class UserRequsestDto {
	private long id;
	private String name;
	private List<Long> roleId;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getRoleId() {
		return roleId;
	}
	public void setRoleId(List<Long> roleId) {
		this.roleId = roleId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
