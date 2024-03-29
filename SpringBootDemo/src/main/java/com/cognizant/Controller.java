package com.cognizant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("")
	public String hi() {
		return "Hi";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@RequestMapping("/users")
	public ArrayList<UserDetails> getList(){
		return userService.getUserList();
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/users")
	public void addUsers(@RequestBody UserDetails s) {
		userService.addUserDetails(s);
	}
	@RequestMapping(method=RequestMethod.PUT,value = "/users/{id}")
	public void updateUser(@RequestBody UserDetails s,@PathVariable int id){
		userService.updateUser(s,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
