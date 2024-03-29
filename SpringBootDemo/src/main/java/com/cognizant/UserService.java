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

	public void setUserList(ArrayList<UserDetails> userList) {
		this.userList = userList;
	}

	public void addUserDetails(UserDetails s) {
		this.userList.add(s);
	}
	
	
	public void updateUser(UserDetails s, int id) {

		for (int count = 0; count < userList.size(); count++) {
			UserDetails t =userList.get(count);
			if(t.getUserId()== id) {
				userList.set(count, s);
				return;
			}
			
		}
	}
	
	public void deleteUser(int id) {
		userList.removeIf(t-> t.getUserId()==id);
	}


	


}