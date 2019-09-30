package com.cognizant;

import java.util.ArrayList;
//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entities.Trainings;
//import com.cognizant.entities.Users;

@Service
public class TrainingsService {

	@Autowired
	private TrainingsRepository tr;

	

	public ArrayList<Trainings> getTrainingsList() {
		
		ArrayList<Trainings> trainingsList = new ArrayList<Trainings>();
		tr.findAll().forEach(trainingsList::add);
		return trainingsList;
	}

	public Trainings getTraining(String id) {

		return tr.findById(id).orElse(null);
	}

//	public void setUserList(ArrayList<UserDetails> userList) {
//		this.userList = userList;
//	}
//
	public void addTrainingDetails(Trainings s) {
		tr.save(s);
	}

//	
//	
	public void updateTraining(Trainings s, String id) {

		
		tr.save(s);
		
	}

//	
	public void deleteTraining(String id) {
		tr.deleteById(id);
	}

}