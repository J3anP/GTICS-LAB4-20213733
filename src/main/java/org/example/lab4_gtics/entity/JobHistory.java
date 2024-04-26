package org.example.lab4_gtics.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.Date;

@Entity
@Table(name="job_history")
public class JobHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_history_id")
    private int jobHistoryId;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employees employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="start_data")
    private Date startData;

    @Column(name="end_data")
    private Date endData;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments departments;

}
