package com.trupti.userprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trupti.userprofile.model.UserResponse;
import com.trupti.userprofile.service.UserService;

@RestController
public class UserProfileController {

	@Autowired
	private UserService service;
	
	@GetMapping("/getUser/{userId}")
	public UserResponse getUser(@PathVariable("userId") String userId) {
		System.out.println("****Calling instance****");
		UserResponse userRes = service.fetchUser(userId);
		return userRes;
	}
}
