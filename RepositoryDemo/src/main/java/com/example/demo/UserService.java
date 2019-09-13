package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	

	public ArrayList<UserDetails> getUserList() {
		
		ArrayList<UserDetails> userList = new ArrayList<UserDetails>();
		ur.findAll().forEach(userList::add);
		return userList;
	}

	public UserDetails getUser(String id) {

		return ur.findById(id).orElse(null);
	}

//	public void setUserList(ArrayList<UserDetails> userList) {
//		this.userList = userList;
//	}
//
	public void addUserDetails(UserDetails s) {
		ur.save(s);
	}

//	
//	
	public void updateUser(UserDetails s, String id) {

		
		ur.save(s);
		
	}

//	
	public void deleteUser(String id) {
		ur.deleteById(id);
	}

}