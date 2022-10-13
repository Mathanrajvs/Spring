package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.setter.Employee;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	@Autowired
	Employee employee;
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(employee);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}


	
	

}
