package com.example.jpaRelationships.repoOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityOnetoOne.Passport;
public interface PassportRepository extends JpaRepository<Passport, Long> {
}
