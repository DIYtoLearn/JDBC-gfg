package com.hcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
