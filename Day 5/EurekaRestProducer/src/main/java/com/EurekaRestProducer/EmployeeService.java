package com.EurekaRestProducer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;
	public List<Employee> getEmployeeInfo() {
		Iterable<Employee> listOfIterable =er.findAll();
		Iterator<Employee> listOfIterator = listOfIterable.iterator();
		List<Employee> listOfRec = new ArrayList<>();
		while(listOfIterator.hasNext()) {
			listOfRec.add(listOfIterator.next());
		}
		return listOfRec;
	}
}
