package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entities.Users;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	

	public ArrayList<Users> getUserList() {
		
		ArrayList<Users> userList = new ArrayList<Users>();
		ur.findAll().forEach(userList::add);
		return userList;
	}

	public Users getUser(String id) {

		return ur.findById(id).orElse(null);
	}

//	public void setUserList(ArrayList<UserDetails> userList) {
//		this.userList = userList;
//	}
//
	public void addUserDetails(Users s) {
		ur.save(s);
	}

//	
//	
	public void updateUser(Users s, String id) {

		
		ur.save(s);
		
	}

//	
	public void deleteUser(String id) {
		ur.deleteById(id);
	}

}