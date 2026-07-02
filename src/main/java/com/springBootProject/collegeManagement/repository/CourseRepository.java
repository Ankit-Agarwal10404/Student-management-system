package com.springBootProject.collegeManagement.repository;

import com.springBootProject.collegeManagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}