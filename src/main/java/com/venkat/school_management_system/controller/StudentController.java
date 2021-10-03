package com.venkat.school_management_system.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class StudentController {
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Hello, Application is running!";
	}

}
