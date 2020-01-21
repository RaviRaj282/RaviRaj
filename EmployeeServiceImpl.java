package com.Ravi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.Entity.Employee;
import com.Ravi.Repositiory.EmployeeRepositiory;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepositiory employeeRepositiory;

	@Override
	public Employee createEmployee(Employee pEmployee) {
		return employeeRepositiory.save(pEmployee);

	}

	@Override
	public Employee getEmployee(Integer id) {
		return employeeRepositiory.findById(id).get();
	}
}
