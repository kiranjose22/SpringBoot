package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id
	private String userId;
	private String userName;

	public UserDetails() {
		
	}
	
	public UserDetails(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
