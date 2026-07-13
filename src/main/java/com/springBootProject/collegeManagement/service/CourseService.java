package com.springBootProject.collegeManagement.service;
import java.util.List;

import com.springBootProject.collegeManagement.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);
    
    public Course assignTeacher(Long courseId, Long teacherId);
    public Course removeTeacher(Long courseId) ;
    
    public List<Course> getTeacherCourses(Long teacherId);

}