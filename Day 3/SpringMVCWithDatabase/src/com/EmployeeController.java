package com;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class EmployeeController {

	@RequestMapping(value="say")
	public ModelAndView sayHello() {
		System.out.println("I Came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="displayEmpInfo")
	public ModelAndView displayDetails() {
			List<Employee> list =  employeeService.getEmployeeService();
			ModelAndView mav = new ModelAndView();
			mav.addObject("empInfo", list);
			mav.setViewName("displayInfo.jsp");
			return mav;
	}

	@RequestMapping(value="checkUserInfo",method=RequestMethod.POST)
	public ModelAndView checkInfo(HttpServletRequest req) {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		ModelAndView mav = new ModelAndView();
		if(user.equals("Raj") && pass.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	@RequestMapping(value="sayRest")
	public @ResponseBody String sayRestMsg() {
		return "Welcome to Spring Rest Service ";
	}
	
	@RequestMapping(value="empXml",produces=MediaType.APPLICATION_XML_VALUE)
	public  List<Employee> retrieveEmpInXML() {
		return employeeService.getEmployeeService();
	}
	
	@RequestMapping(value="empJson",produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<Employee> retrieveEmpInJson() {
		return employeeService.getEmployeeService();
	}
}
