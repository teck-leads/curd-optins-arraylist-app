package com.techleads.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techleads.app.model.Employee;
import com.techleads.app.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/employees")
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}

	@GetMapping(value = "/employees/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.findEmployeeById(id);

	}
	
	
	@PostMapping(value = "/employees")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}
	
	
	@PutMapping(value = "/employees")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployeeById(employee);

	}
	
	@DeleteMapping(value = "/employees/{id}")
	public String updateEmployee(@PathVariable("id") Integer id) {
		return employeeService.deleteById(id);

	}

}
