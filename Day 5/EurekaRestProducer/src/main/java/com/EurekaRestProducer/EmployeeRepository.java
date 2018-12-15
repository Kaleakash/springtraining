package com.EurekaRestProducer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	//@Query(value="")
	//public int storeEmpInfo();
}
