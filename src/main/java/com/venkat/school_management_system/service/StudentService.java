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


	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public Student getStudentsById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	public Student saveStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	

}
