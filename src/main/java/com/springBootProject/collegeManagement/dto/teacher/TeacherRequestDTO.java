package com.springBootProject.collegeManagement.dto.teacher;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherRequestDTO {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String department;

    @NotNull
    private Double salary;

    @NotNull
    private Integer experience;

    @NotBlank
    private String qualification;
}