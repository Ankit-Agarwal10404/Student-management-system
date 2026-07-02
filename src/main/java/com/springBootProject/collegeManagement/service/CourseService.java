package com.springBootProject.collegeManagement.service;
import java.util.List;

import com.springBootProject.collegeManagement.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    CourseService updateCourse(Long id, Course course);

    void deleteCourse(Long id);

}