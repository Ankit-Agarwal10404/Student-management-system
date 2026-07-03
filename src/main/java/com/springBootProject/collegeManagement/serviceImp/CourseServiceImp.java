package com.springBootProject.collegeManagement.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBootProject.collegeManagement.entity.Course;
import com.springBootProject.collegeManagement.repository.CourseRepository;
import com.springBootProject.collegeManagement.service.CourseService;

@Service
public class CourseServiceImp implements CourseService{

	private final CourseRepository courseRepository;
	
	public CourseServiceImp(CourseRepository courseRepository) {
		// TODO Auto-generated constructor stub
		this.courseRepository=courseRepository;
	}
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElse(null);
	}

	@Override
	public Course updateCourse(Long id, Course course) {
		Course c = courseRepository.findById(id).orElse(null);
		if(c!=null) {
			c.setCourseName(course.getCourseName());
			c.setDuration(course.getDuration());
			c.setCredits(course.getCredits());
			c.setFees(course.getFees());
			
			return courseRepository.save(c);
		}
		return null;
	}

	@Override
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
		
	}

}
