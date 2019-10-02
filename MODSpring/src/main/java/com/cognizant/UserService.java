package com.cognizant;

import java.util.ArrayList;
//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entities.TrainerDetails;
import com.cognizant.entities.Users;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	@Autowired
	private TrainerDetailsRepository tdr;

	

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
	public void addUserDetails(MentorSignUpModel s) {
		Users user = new Users();
		TrainerDetails trainerDetails = new TrainerDetails();
		trainerDetails.setEmail(s.getEmail());
		trainerDetails.setBlogs(s.isBlogs());
		trainerDetails.setDemos(s.isDemos());
		trainerDetails.setExperience(s.getExperience());
		trainerDetails.setLinkedin(s.getLinkedin());
		trainerDetails.setPpts(s.isPpts());
		trainerDetails.setTimeslot(s.getTimeslot());
		trainerDetails.setTimezone(s.getTimezone());
		trainerDetails.setVideos(s.isVideos());
		tdr.save(trainerDetails);
		user.setEmail(s.getEmail());
		user.setPassword(s.getPassword());
		user.setPhone(s.getPhone());
		user.setRole(s.getRole());
		user.setStatus(s.getStatus());
		user.setTrainerDetails(trainerDetails);
		user.setUserName(s.getUserName());
		ur.save(user);
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