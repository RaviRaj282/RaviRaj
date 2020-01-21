package com.Ravi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ravi.Entity.Employee;
import com.Ravi.Service.EmployeeService;

import antlr.collections.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;

	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee pEmployee) {
		return employeeservice.createEmployee(pEmployee);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public com.Ravi.Entity.Employee getEmployee(@RequestParam Integer id) { 
		
		
		return employeeservice.getEmployee(id);
	}

}
