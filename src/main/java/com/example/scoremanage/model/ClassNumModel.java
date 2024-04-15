package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "classnums")
public class ClassNumModel {
	@Id
	@Column(length = 3, nullable = false)
	private String schoolCd;
	
	@Id
	@Column(length = 5, nullable = false)
	private String classNum;
	
	public String getSchoolCd() {
		return schoolCd;
	}
	
	public void setSchoolCd(String schoolCd) {
		this.schoolCd = schoolCd;
	}
	
	public String getClassNum() {
		return classNum;
	}
	
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
}
