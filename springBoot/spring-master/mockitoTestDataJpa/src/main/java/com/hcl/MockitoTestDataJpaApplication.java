package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.beans.Employee;
import com.hcl.repo.EmployeeRepository;

@SpringBootApplication
public class MockitoTestDataJpaApplication  {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MockitoTestDataJpaApplication.class, args);
	}

	

}
