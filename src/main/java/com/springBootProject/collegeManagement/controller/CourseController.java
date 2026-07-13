package com.springBootProject.collegeManagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.collegeManagement.entity.Course;
import com.springBootProject.collegeManagement.entity.Student;
import com.springBootProject.collegeManagement.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Course Controllers", description = "CURD operations for Courses")

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	private final CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService=courseService;
	}	
	
	@Operation(summary = "Add Course",
    		description = "create a new course for students")

	@PostMapping
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@Operation(summary = "Get all Course",
    		description = "Getting All Course details")

	@GetMapping
    public List<Course> getAllStudents() {

        return courseService.getAllCourses();

    }
	
	@Operation(summary = "Get Course",
    		description = "Getting Course details using Course Id")

	 @GetMapping("/{id}")
	 public Course getCourseById(@Parameter(description = "Course ID")
     										@PathVariable Long id) {
		 return courseService.getCourseById(id);
	 }
	 
	@Operation(summary = "Update Course",
    		description = "Update Course details using Course Id and updated course details")

	 @PutMapping("/{id}")
	    public Course updateStudent(@Parameter(description = "Course ID")
	    							@PathVariable Long id,
	                                 @RequestBody Course course) {

	        return courseService.updateCourse(id, course);

	    }
	
	@Operation(summary = "Delete Course",
    		description = "Deleting Course details using Course Id")

	 @DeleteMapping("/{id}")
	    public String deleteCourse(@Parameter(description = "Course ID")
	    										@PathVariable Long id) {
		 	courseService.deleteCourse(id);
	        return "Student Deleted Successfully";
	    }
	
	
	
	
	
	@PutMapping("/{courseId}/teacher/{teacherId}")
	public ResponseEntity<Course> assignTeacher(
	        @PathVariable Long courseId,
	        @PathVariable Long teacherId) {

	    return ResponseEntity.ok(courseService.assignTeacher(courseId, teacherId));
	}
	
	@DeleteMapping("/{courseId}/teacher")
	public ResponseEntity<Course> removeTeacher(@PathVariable Long courseId) {

	    return ResponseEntity.ok(courseService.removeTeacher(courseId));
	}
	
	
}
