package com.cognizant;

import java.util.Arrays;
import java.util.List;

public class UserDetails {

	private int userId;
	private String userName;

	public UserDetails() {
		
	}
	
	public UserDetails(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
