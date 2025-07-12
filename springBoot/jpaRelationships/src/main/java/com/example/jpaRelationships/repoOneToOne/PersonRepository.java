package com.example.jpaRelationships.repoOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRelationships.entityOnetoOne.Person;
public interface PersonRepository extends JpaRepository<Person, Long> {
}
