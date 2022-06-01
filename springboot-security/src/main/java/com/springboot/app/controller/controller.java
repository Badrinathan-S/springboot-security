package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.service.CustomerUserService;

@RestController
public class controller {
	
	@Autowired
	CustomerUserService customerUserService;
	
	@GetMapping("/")
	public String welcomePage() {
		
		return ("<h1>Welcome</h1>");
	}

}
