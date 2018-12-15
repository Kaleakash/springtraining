package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/getEmp",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public Employee getEmpJson() {
		System.out.println("Came to Controller Layer");
		return employeeService.getEmployee();
	}
}
