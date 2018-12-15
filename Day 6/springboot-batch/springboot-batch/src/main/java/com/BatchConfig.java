package com;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	
	@Autowired
	EmployeeRepository rd;
	
	@Bean
	public Job processJob() {
		System.out.println("1");
		return jobBuilderFactory.get("processJob")
				
				.incrementer(new RunIdIncrementer()).listener(listener())
				.flow(orderStep1()).end().build();
	}

	@Bean
	public Step orderStep1() {
		System.out.println("2");
		return stepBuilderFactory.get("orderStep1").<Employee, Employee> chunk(1)
				.reader(new Reader()).processor(new Processor())
				.writer(new Writer(rd)).build();
	}

	@Bean
	public JobExecutionListener listener() {
		System.out.println("3");
		return new JobCompletionListener();
	}

}