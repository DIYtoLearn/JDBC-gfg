package com.example.jpaRelationships.repoOneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityOneToMany.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

