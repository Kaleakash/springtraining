package com;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.Employee;
import com.EmployeeRepository;

@Configuration
public class Writer implements  ItemWriter<Employee> {


	EmployeeRepository er;
	
	public Writer() {
		// TODO Auto-generated constructor stub
	}
	
	public Writer(EmployeeRepository er) {
		super();
		this.er = er;
	}

	public void write(List<? extends Employee> emp) throws Exception {
		System.out.println("Writer Data");
		for (Employee obj:emp) {
			System.out.println("Writing the data " + obj);
			er.save(obj);
		}
	}

}