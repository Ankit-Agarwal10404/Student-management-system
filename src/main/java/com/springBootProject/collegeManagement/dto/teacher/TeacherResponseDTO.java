package com.springBootProject.collegeManagement.dto.teacher;

import java.util.List;

import com.springBootProject.collegeManagement.dto.course.CourseSummaryDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherResponseDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String department;

    private Double salary;

    private Integer experience;

    private String qualification;

    private List<CourseSummaryDTO> courses;
}