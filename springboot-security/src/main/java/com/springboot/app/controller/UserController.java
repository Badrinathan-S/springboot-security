package com.springboot.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entities.User;

@RestController
public class UserController {
	
	public String home() {
		
		User user = new User();
		
		user.setFirstName("name");
		
		String name = user.getFirstName();
		
		return name;

	}

}
