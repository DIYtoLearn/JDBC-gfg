package com.example.jpaRelationships;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpaRelationships.entityOneToMany.Department;
import com.example.jpaRelationships.entityOneToMany.Employee;
import com.example.jpaRelationships.repoOneToMany.DepartmentRepository;
import com.example.jpaRelationships.repoOneToMany.EmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner {

	private final DepartmentRepository departmentRepository;
	private final EmployeeRepository employeeOneToManyRepository;
	AppRunner(DepartmentRepository departmentRepository, EmployeeRepository employeeOneToManyRepository) {

		this.departmentRepository = departmentRepository;
		this.employeeOneToManyRepository = employeeOneToManyRepository;

	}

	@Override
	public void run(String... args) {
		
		// 🔹 One-to-Many
		Employee emp1 = new Employee();
		emp1.setName("Alice");

		Employee emp2 = new Employee();
		emp2.setName("Bob");

		employeeOneToManyRepository.saveAll(Arrays.asList(emp1, emp2));

		Department department = new Department();
		department.setName("IT");
		department.setEmployees(Arrays.asList(emp1, emp2));
		departmentRepository.save(department);

		System.out.println("One-to-Many: " + departmentRepository.findAll());

		
	}
}
