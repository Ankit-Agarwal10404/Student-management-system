package com.springBootProject.collegeManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootProject.collegeManagement.dto.student.StudentRequestDTO;
import com.springBootProject.collegeManagement.dto.student.StudentResponseDTO;
import com.springBootProject.collegeManagement.entity.Student;

public interface StudentService {
	 	StudentResponseDTO saveStudent(StudentRequestDTO student);

	    List<StudentResponseDTO> getAllStudents();

	    StudentResponseDTO getStudentById(Long id);

	    StudentResponseDTO updateStudent(Long id, StudentRequestDTO student);

	    void deleteStudent(Long id);
	    
	    Student assignCourse(Long studentId, Long courseId);
	    
	    Student removeCourse(Long studentId, Long courseId);


}
