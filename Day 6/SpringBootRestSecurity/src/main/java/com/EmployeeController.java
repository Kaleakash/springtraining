package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@RequestMapping(value="/")
	public String openPage(ModelMap mm) {
		mm.addAttribute("name", "akash");
		return "open";
	}
	@RequestMapping(value="/emp")
	public Employee getEmployee() {
		return new Employee(1,"Raj",12000);
	}
}
