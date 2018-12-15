package com;

import org.springframework.batch.item.ItemProcessor;

import com.Employee;
public class Processor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee data) throws Exception {
		System.out.println("Process data");
		return data;
	}

}