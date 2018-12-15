package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
/*	@RequestMapping(value="welcome")
	public String sayHello() {
		return "Welcome";
	}
*/
	@RequestMapping(value="/welcome")
	public String sayHello() {
		System.out.println("I Came Here - in SayHello() method");
		return "Welcome to Spring boot Controller";
	}
	@RequestMapping(value="/getEmp",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public Employee getEmpJson() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(12000);
		return emp;
	}
}
