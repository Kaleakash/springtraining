package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	Employee emp1= (Employee)ac.getBean("obj1");
	emp1.display();
	System.out.println(emp1);
	
	Employee emp2= (Employee)ac.getBean("obj1");
	emp2.display();
	System.out.println(emp2);
	
	emp2.setName("Ravi");
	System.out.println("After name change");
	System.out.println(emp1);
	System.out.println(emp2);
	
	Employee emp3= (Employee)ac.getBean("obj3");
	System.out.println(emp3);
	
	Employee emp4= (Employee)ac.getBean("obj4");
	System.out.println(emp4);
	

	Employee emp= (Employee)ac.getBean("emp");
	System.out.println(emp);

	
	}

}
