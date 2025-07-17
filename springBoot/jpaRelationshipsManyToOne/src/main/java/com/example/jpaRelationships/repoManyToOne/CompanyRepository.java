package com.example.jpaRelationships.repoManyToOne;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityManyToOne.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
