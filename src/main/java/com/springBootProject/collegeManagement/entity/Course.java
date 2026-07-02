package com.springBootProject.collegeManagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String courseName;

    private String duration;

    private Integer credits;

    private Double fees;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

}