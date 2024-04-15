package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjects")
public class SubjectModel {
	@Id
	@Column(length = 3, nullable = false)
	private String schoolCd;
	
	@Id
	@Column(length = 3, nullable = false)
	private String cd;
	
	@Column(length = 20, nullable = true)
	private String name;
	
	public String getSchoolCd() {
		return schoolCd;
	}
	
	public void setSchoolCd(String schoolCd) {
		this.schoolCd = schoolCd;
	}
	
	public String getCd() {
		return cd;
	}
	
	public void setCd(String cd) {
		this.cd = cd;
	}
	
	
}
