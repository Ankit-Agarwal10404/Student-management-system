package com.springBootProject.collegeManagement.serviceImp;
import org.springframework.stereotype.Service;

import com.springBootProject.collegeManagement.entity.Student;
import com.springBootProject.collegeManagement.repository.StudentRepository;
import com.springBootProject.collegeManagement.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImp(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        Student existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setFirstName(student.getFirstName());
            existing.setLastName(student.getLastName());
            existing.setEmail(student.getEmail());
            existing.setCourse(student.getCourse());
            existing.setPercentage(student.getPercentage());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteStudent(Long id) {

        repository.deleteById(id);

    }

}