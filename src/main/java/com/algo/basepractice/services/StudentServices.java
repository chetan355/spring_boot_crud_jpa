package com.algo.basepractice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.basepractice.dao.StudentDao;
import com.algo.basepractice.entities.Student;

@Service
public class StudentServices 
{
	@Autowired
	StudentDao dao;
	
	public Student getStudentById(int id) {
		return dao.findById(id).get();
	}
	public List<Student> getAllStudents(){
		return dao.findAll();
	}
	public Student insertStudent(Student student) {
		return dao.save(student);
	}
	public String deleteStudent(int id) {
		dao.deleteById(id);
		return "Student Deleted";
	}
}
