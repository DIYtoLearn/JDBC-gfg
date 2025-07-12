package com.example.jpaRelationships.repoManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityManyToMany.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

