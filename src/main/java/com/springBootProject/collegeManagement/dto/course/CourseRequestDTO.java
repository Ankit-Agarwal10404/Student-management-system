package com.springBootProject.collegeManagement.dto.course;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseRequestDTO {

    @NotBlank
    private String courseName;

    @NotBlank
    private String duration;

    @NotNull
    private Integer credits;

    @NotNull
    private Double fees;
}