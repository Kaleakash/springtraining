package com;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public Employee getEmployee() {
		System.out.println("Came to Service Layer");
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(12000);
		return emp;
	}
}
