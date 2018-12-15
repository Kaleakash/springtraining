package com.EurekaRestProducer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	@RequestMapping(value="empInfo")
	public List<Employee> listOfEmployeeInfo() {
		
		return es.getEmployeeInfo();
	}
}
