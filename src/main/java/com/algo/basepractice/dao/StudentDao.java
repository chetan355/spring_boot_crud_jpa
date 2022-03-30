package com.algo.basepractice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algo.basepractice.entities.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{
	
}
