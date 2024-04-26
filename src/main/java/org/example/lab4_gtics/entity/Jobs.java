package org.example.lab4_gtics.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private int jobId;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="min_salary")
    private Integer minSalary;

    @Column(name="max_salary")
    private Integer maxSalary;
}
