package com.example.jpaRelationships.repoOneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityOneToMany.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

