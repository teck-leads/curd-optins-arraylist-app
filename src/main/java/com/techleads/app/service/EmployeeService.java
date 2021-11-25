package com.techleads.app.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techleads.app.model.Employee;

@Service
public class EmployeeService {
	private static List<Employee> employees = null;
	static {
		employees = new ArrayList<>();
		employees.add(new Employee(101, "madhav", "Hyderabad", "java", LocalDate.now()));
		employees.add(new Employee(102, "teja", "Rajamandri", "Oracle", LocalDate.of(2017, Month.FEBRUARY, 24)));
	}

	public List<Employee> findAllEmployees() {
		return employees;
	}

	public Employee findEmployeeById(Integer id) {
//		Optional<Employee> findFirst = employees.stream().filter(emp -> emp.getId().equals(id)).findFirst();
//
//		if (findFirst.isPresent()) {
//			return findFirst.get();
//		}
		for(Employee emp: employees) {
			if(emp.getId().equals(id)) {
				return emp;
			}
		}
		

		return new Employee();

	}

	public String saveEmployee(Employee employee) {
		employees.add(employee);

		return "employee with id " + employee.getId() + " is saved";
	}

	public String updateEmployeeById(Employee employee) {

		Employee emp = findEmployeeById(employee.getId());
		if (emp.getId() == null) {
			return "employee with id " + employee.getId() + " is not found";
		}

		emp.setDateOfJoin(employee.getDateOfJoin());
		emp.setLocation(employee.getLocation());
		emp.setSkillSet(employee.getSkillSet());

		return "employee with id " + employee.getId() + " details are updated";
	}

	public String deleteById(Integer id) {

		Employee emp = findEmployeeById(id);
		if (emp.getId() == null) {
			return "employee with id " + id + " is not found";
		}
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee emp1 = itr.next();
			if (emp1.getId().equals(id)) {
				itr.remove();
			}
		}

		return "employee with id " + id + " details are removed";
	}

}
