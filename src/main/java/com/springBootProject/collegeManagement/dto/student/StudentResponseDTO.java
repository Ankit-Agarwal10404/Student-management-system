package com.springBootProject.collegeManagement.dto.student;

import java.util.Set;

import com.springBootProject.collegeManagement.dto.course.CourseSummaryDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponseDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Double percentage;

    private Set<CourseSummaryDTO> courses;
}