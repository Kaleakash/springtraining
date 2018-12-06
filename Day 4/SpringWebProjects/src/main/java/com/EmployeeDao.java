package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository rd;
	
	public List<Employee> getEmployeeInfo() {
					Iterable ii =  rd.findAll();
					Iterator li	 = ii.iterator();
					List<Employee> listOfRec = new ArrayList<Employee>();
					while(li.hasNext()) {
						Employee emp = (Employee)li.next();
						listOfRec.add(emp);
					}
					return listOfRec;
	}
}
