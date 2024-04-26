package org.example.lab4_gtics.entity;

import jakarta.persistence.*;

@Entity
@Table(name="departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private int departmentId;

    @Column(name="department_name")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Locations location;

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employees manager;
}
