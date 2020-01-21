package com.Ravi.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ravi.Entity.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer> {

}
