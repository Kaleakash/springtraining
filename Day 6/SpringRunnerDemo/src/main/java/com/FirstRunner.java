package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value=1)
@Component
public class FirstRunner implements CommandLineRunner{

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("First runner code");
		
	}

}
@Order(value=3)
@Component
class A implements CommandLineRunner {
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Third runner code");
	}
}

@Order(value=2)
@Component
class B implements CommandLineRunner {
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Second runner code");
	}
}