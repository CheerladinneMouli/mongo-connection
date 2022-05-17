package com.jobiak.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobiak.mongo.model.Student;
import com.jobiak.mongo.repo.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	public StudentRepository studentrepo;
	
	@GetMapping(value="/all")
	public List<Student>getAllStudents(){
		return studentrepo.findAll();
		
	}
	@PostMapping(value="/create")
	public String createStudent(@RequestBody Student student) {
		Student insertstudent=studentrepo.insert(student);
		return "Student created"+insertstudent.getName();
		
	}

}
