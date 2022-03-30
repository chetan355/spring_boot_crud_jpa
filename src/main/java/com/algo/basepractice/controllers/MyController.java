package com.algo.basepractice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algo.basepractice.entities.Student;
import com.algo.basepractice.services.StudentServices;

@RestController
@RequestMapping("/student")
public class MyController 
{
	@Autowired
	StudentServices service;
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	@PostMapping
	public Student insertStudent(Student student) {
		return service.insertStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
