package com.example.jpaRelationships.repoManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityManyToMany.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
