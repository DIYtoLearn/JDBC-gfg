package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Employee;
import com.example.model.Student;
import com.example.repository.EmployeeRepository;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class JoinedStrategy {

	public static void main(String[] args) {
		SpringApplication.run(JoinedStrategy.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeRepository employeeRepository, StudentRepository studentRepository) {
		return args -> {
			// Save Employee
			Employee emp = new Employee("Sukumar", 50000);
			employeeRepository.save(emp);

			// Save Student
			Student stu = new Student("Saqib", "Computer Science");
			studentRepository.save(stu);

			System.out.println("Data Saved Successfully!");
		};
	}
}
