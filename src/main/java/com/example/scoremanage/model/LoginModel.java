package com.example.scoremanage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class LoginModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long loginId;
	
	@Column(length = 128, nullable = false)
    private String password;
	
	public long getLoginId() {
		return loginId;
	    }

	    public void setLoginId(long loginId) {
	        this.loginId = loginId;
	    }
	    
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	
}
