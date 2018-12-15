package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		 registry.addViewController("/home").setViewName("home");
		 registry.addViewController("/abc").setViewName("demo");;
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/hello").setViewName("hello");
	        registry.addViewController("/login").setViewName("login");
	}
	
	/*@RequestMapping(value = {"/", "/home"})
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "/login";
	}*/
}
