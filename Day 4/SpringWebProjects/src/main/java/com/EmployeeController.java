package com;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController		//@Controller + @ResponseBody
//@Controller
public class EmployeeController {

	/*@RequestMapping(value="sayHello")
	public @ResponseBody String sayHello() {
		return "Welcome to Spring boot with Rest ";
	}*/
	
	
	@RequestMapping(value="sayHello")
	public  String sayHello() {
		return "Welcome to Spring boot with Rest ";
	}
	
	
	@RequestMapping(value="empJson")
	public Employee getEmployeeJson() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ajay");
		emp.setSalary(12000);
		return emp;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="allEmployeeJson",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeJson() {
		return employeeService.listOfEmp();
	}
	
	@RequestMapping(value="allEmployeeXml",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getAllEmployeeXml() {
		return employeeService.listOfEmp();
	}
}
