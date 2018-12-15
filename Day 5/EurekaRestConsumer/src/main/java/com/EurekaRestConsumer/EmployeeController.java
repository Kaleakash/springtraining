package com.EurekaRestConsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="allRestEmployee")
	public List<Employee> getEmployeeRestClient() {
		System.out.println("Hi");  
		List<Employee> listOfRec = restTemplate.exchange("http://akash-pc:8181/empInfo", HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<Employee>>() {
				}).getBody();
		System.out.println("Hello");
		return listOfRec;
	}
	
	
	
	
	

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
