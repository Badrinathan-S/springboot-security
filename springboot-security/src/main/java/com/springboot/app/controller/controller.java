package com.springboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/")
	public String welcomePage() {
		
		return ("<h1>Welcome</h1>");
	}

}
