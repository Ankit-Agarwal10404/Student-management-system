package com.springBootProject.collegeManagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.springBootProject.collegeManagement.dto.student.StudentRequestDTO;
import com.springBootProject.collegeManagement.dto.student.StudentResponseDTO;
import com.springBootProject.collegeManagement.dto.teacher.TeacherResponseDTO;
import com.springBootProject.collegeManagement.entity.Student;
import com.springBootProject.collegeManagement.entity.Teacher;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	Student toEntity(StudentRequestDTO studentRequestDTO);
	StudentResponseDTO toDTO(Student student);
	List<StudentResponseDTO> toDTOList(List<Student> students);
}
