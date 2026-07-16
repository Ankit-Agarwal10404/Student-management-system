package com.springBootProject.collegeManagement.dto.teacher;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherSummaryDTO {

    private Long id;

    private String firstName;

    private String lastName;
}