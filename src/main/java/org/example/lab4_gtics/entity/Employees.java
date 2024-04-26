package org.example.lab4_gtics.entity;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employeeId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String email;

    private String password;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="hire_date")
    private Date hireDate;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs job;

    private Double salary;

    @Column(name="commission_pct")
    private Double commissionPct;

    @OneToOne(mappedBy="employees")

    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments department;

    private Integer enabled;


}
