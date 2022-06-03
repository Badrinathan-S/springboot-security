package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entities.User;
import com.springboot.app.repository.UserRepository;

@RestController
@RequestMapping("/secure/test")
public class AdminController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		
		String password = user.getPassword();
		user.setPassword(passwordEncoder.encode(password));
		userRepository.save(user);
		return "return add user";
		 
	}

}
