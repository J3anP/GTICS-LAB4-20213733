package org.example.lab4_gtics.repository;
import org.example.lab4_gtics.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
