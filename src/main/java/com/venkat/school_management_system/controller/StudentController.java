package com.venkat.school_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.school_management_system.model.Student;
import com.venkat.school_management_system.service.StudentService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Hello, Application is running!";
	}
	
	@GetMapping("/students")
	public List<Student> getAllEmployees() {
		return studentService.getAllEmployees();
	}
	
	@GetMapping("/students/{id}")
	public Student getEmployeeById(@PathVariable Long id) {
		return studentService.getEmployeeById(id);
	}
	
	@PostMapping("/students")
	public Student saveEmployeeDetails(@RequestBody Student student) {
		return studentService.saveEmployeeDetails(student);
	}
	
	@PutMapping("/students")
	public Student updateEmployee(@RequestBody Student student) {
		return studentService.updateEmployee(student);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Long id) {
		studentService.deleteEmployeeById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
