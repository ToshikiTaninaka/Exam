package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class TeacherModel {
	@Id
	@Column(length = 10, nullable = false)
	private String id;

	@Column(length = 30, nullable = true)
	private String password;
	
	@Column(length = 10, nullable = true)
	private String name;
	
	@Column(length = 3, nullable = true)
	private String schoolCd;

	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSchoolCd() {
		return schoolCd;
	}
	
	public void setSchoolCd(String schoolCd) {
		this.schoolCd = schoolCd;
	}
	
	
	
	
}
