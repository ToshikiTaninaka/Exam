package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "schools")
public class SchoolModel {
	@Id
	@Column(length = 3, nullable = false)
	private String cd;
	
	@Column(length = 20, nullable = true)
	private String name;
	
	public String getCd() {
		return cd;
	}
	
	public void setCd(String cd) {
		this.cd = cd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
