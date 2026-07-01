package com.springBootProject.collegeManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootProject.collegeManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
