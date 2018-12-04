package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beanx.xml");
Employee emp = (Employee)ac.getBean("emp");
System.out.println(emp);
	Address add = emp.getAdd();
	add.setCity("Mumbia");
	add.setState("Mh");
	emp.setId(103);
	emp.setName("Seeta");
	emp.setAdd(add);
	System.out.println(emp);
	}

}
