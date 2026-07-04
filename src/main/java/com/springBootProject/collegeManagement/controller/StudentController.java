package com.springBootProject.collegeManagement.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.collegeManagement.entity.Student;
import com.springBootProject.collegeManagement.service.StudentService;

@RestController
@RequestMapping("/api/students")

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);

    }

    @GetMapping
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();

    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);

    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {

        return studentService.updateStudent(id, student);

    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);

        return "Student Deleted Successfully";

    }
    
    @PostMapping("/{studentId}/courses/{courseId}")
    public Student assignCourse(
            @PathVariable Long studentId,
            @PathVariable Long courseId) {

        return studentService.assignCourse(studentId, courseId);
    }

}