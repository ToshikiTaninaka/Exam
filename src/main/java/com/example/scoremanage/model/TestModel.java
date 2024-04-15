package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tests")
public class TestModel {
	@Id
	@Column(length = 10, nullable = false)
	private String studentNo;
	
	@Id
	@Column(length = 3, nullable = false)
	private String subjectCd;
	
	@Id
	@Column(length = 10, nullable = false)
	private String schoolCd;
	
	@Id
	@Column (length = 10, nullable = false)
	private Integer no;
	
	@Column (length = 10, nullable = true)
	private Integer point;
	
	@Column (length = 5, nullable = true)
	private String classNum;
	
	public String getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getSubjectCd() {
		return subjectCd;
	}
	
	public void setSubjectCd(String subjectCd) {
		this.subjectCd = subjectCd;
	}
	
	public String getSchoolCd() {
		return schoolCd;
	}
	
	public void setSchoolCd(String schoolCd) {
		this.schoolCd = schoolCd;
	}
	
	public Integer getNo() {
		return no;
	}
	
	public void setNo(Integer no) {
		this.no = no;
	}
	
	public Integer getPoint() {
		return point;
	}
	
	public void setPoint(Integer point) {
		this.point = point;
	}
	
	public String getClassNum() {
		return classNum;
	}
	
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	
	
	
	

}
