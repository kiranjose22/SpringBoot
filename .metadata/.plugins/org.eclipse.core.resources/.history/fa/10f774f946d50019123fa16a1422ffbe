package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	ArrayList<UserDetails> userList = new ArrayList<UserDetails>(Arrays.asList(new UserDetails(101, "kiran"),
			new UserDetails(102, "Karun"), new UserDetails(103, "Glin")));
	
	public ArrayList<UserDetails> getUserList() {
		return userList;
	}

	public void setStateList(ArrayList<UserDetails> userList) {
		this.userList = userList;
	}

	public void addUserDetails(UserDetails s) {
		this.userList.add(s);
	}

}