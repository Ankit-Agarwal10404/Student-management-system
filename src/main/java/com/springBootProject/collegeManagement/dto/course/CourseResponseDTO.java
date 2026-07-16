package com.springBootProject.collegeManagement.dto.course;

import java.util.Set;

import com.springBootProject.collegeManagement.dto.student.StudentSummaryDTO;
import com.springBootProject.collegeManagement.dto.teacher.TeacherSummaryDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponseDTO {

    private Long id;

    private String courseName;

    private String duration;

    private Integer credits;

    private Double fees;

    private TeacherSummaryDTO teacher;

    private Set<StudentSummaryDTO> students;
}
