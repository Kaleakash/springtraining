package com.DemoAppClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoAppClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppClientApplication.class, args);
		System.out.println("--First client enable ----");
	}
}
