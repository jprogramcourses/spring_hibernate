package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEmployeeService;

@SpringBootApplication
public class SpringHibernateApplication implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.findAll().stream().forEach(System.out::println);
		
	}

}
