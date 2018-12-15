package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.Employee;


public class Reader implements ItemReader<Employee> {
	
	
	private Employee[] obj = new Employee[2];
		
	public Reader() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<2;i++) {
			obj[i]=new Employee(i+1,"Ravi",10000+i);
		}
	}
	private int count = 0;

	@Override
	public Employee read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		System.out.println("Read");
			
			if (count < obj.length) {
				return obj[count++];
			} else {
				count = 0;
			}
			
		
		
		return null;
	}

}