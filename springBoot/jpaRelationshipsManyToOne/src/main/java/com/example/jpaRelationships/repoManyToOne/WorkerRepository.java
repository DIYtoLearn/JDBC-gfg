package com.example.jpaRelationships.repoManyToOne;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityManyToOne.Worker;
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
