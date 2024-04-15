package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {
	@Id
	@Column(length = 10, nullable = false)
	private String no;
	
	@Column(length = 10, nullable = true)
	private String name;
	
	@Column(length = 10, nullable = true)
	private Integer entYear;
	
	@Column (length = 3, nullable = true)
	private String classNum;
	
	@Column (nullable = true)
	private Boolean isAttend;
	
	@Column (length = 3, nullable = true)
	private String schoolCd;
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getEntYear() {
		return entYear;
	}
	
	public void setYear(Integer entYear) {
		this.entYear = entYear;
	}
	
	public String getClassNum() {
		return classNum;
	}
	
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public Boolean getIsAttend() {
		return isAttend;
	}
	
	public void setAttend(Boolean isAttend) {
		this.isAttend = isAttend;
	}
	
	public String getSchoolCd() {
		return schoolCd;
	}
	
	public void setSchoolCd(String schoolCd) {
		this.schoolCd = schoolCd;
	}
	
	
	
	
	
	

}
