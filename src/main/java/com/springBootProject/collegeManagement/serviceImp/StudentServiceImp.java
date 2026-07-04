package com.springBootProject.collegeManagement.serviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProject.collegeManagement.entity.Course;
import com.springBootProject.collegeManagement.entity.Student;
import com.springBootProject.collegeManagement.repository.CourseRepository;
import com.springBootProject.collegeManagement.repository.StudentRepository;
import com.springBootProject.collegeManagement.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
    private final StudentRepository studentRepository;
    
	@Autowired
    private final CourseRepository courseRepository;

    public StudentServiceImp(StudentRepository repository, CourseRepository courseRepository) {
        this.studentRepository = repository;
        this.courseRepository=courseRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        Student existing = studentRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setFirstName(student.getFirstName());
            existing.setLastName(student.getLastName());
            existing.setEmail(student.getEmail());
            existing.setPercentage(student.getPercentage());

            return studentRepository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);

    }

	@Override
	public Student assignCourse(Long studentId, Long courseId) {
		Student student = studentRepository.findById(studentId)
				.orElseThrow(()-> new RuntimeException("student not found"));
		
		Course course = courseRepository.findById(courseId)
				.orElseThrow(()-> new RuntimeException("course not found"));
		
		student.getCourses().add(course);	
		
		return studentRepository.save(student);
	}

}