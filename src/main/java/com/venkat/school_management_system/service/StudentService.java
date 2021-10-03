package com.venkat.school_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.school_management_system.model.Student;
import com.venkat.school_management_system.repository.StudentRepository;
@Service
public class StudentService {
	
@Autowired	
private StudentRepository studentRepository;


	public List<Student> getAllEmployees() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public Student getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	public Student saveEmployeeDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public Student updateEmployee(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	

}
