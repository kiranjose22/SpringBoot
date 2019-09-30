package com.cognizant;

import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entities.Trainings;
import com.cognizant.entities.Users;

@RestController
public class Controller {
	
	@Autowired
	UserService userService;
	
	@Autowired
	TrainingsService trainingsService;
	
	@RequestMapping("")
	public String hi() {
		return "Hi";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@RequestMapping("/users")
	public ArrayList<Users> getList(){
		return userService.getUserList();
	}
	
	@RequestMapping("/trainings")
	public ArrayList<Trainings> getTrainingList(){
		return trainingsService.getTrainingsList();
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/trainings")
	public void addTrainings(@RequestBody Trainings s) {
		trainingsService.addTrainingDetails(s);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/users")
	public void addUsers(@RequestBody Users s) {
		userService.addUserDetails(s);
	}
	@RequestMapping(method=RequestMethod.PUT,value = "/users/{id}")
	public void updateUser(@RequestBody Users s,@PathVariable String id){
		userService.updateUser(s,id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/trainings/{id}")
	public void updateTraining(@RequestBody Trainings s,@PathVariable String id){
		trainingsService.updateTraining(s, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}
