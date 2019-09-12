package com.cognizant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
