package com.DemoAppClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping(value="one")
	public String sayHello() {
		return "Welcome to Spring Micro service one";
	}
}
