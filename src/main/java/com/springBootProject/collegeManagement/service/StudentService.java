package com.springBootProject.collegeManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootProject.collegeManagement.entity.Student;

public interface StudentService {
	 	Student saveStudent(Student student);

	    List<Student> getAllStudents();

	    Student getStudentById(Long id);

	    Student updateStudent(Long id, Student student);

	    void deleteStudent(Long id);

}
