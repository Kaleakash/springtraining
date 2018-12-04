package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
Employee emp = (Employee)ac.getBean("employee");
emp.setId(103);
emp.setName("Ramu");
emp.setSalary(18000);

EmployeeDao ed = (EmployeeDao)ac.getBean("employeeDao");
int res = ed.storeEmployee(emp);
if(res>0) {
	System.out.println("Record stored successfully.....");
}
	}

}
