package com.springBootProject.collegeManagement.dto.student;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentSummaryDTO {

    private Long id;

    private String firstName;

    private String lastName;

}