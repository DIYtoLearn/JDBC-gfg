package com.example.jpaRelationships;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpaRelationships.entityOnetoOne.Passport;
import com.example.jpaRelationships.entityOnetoOne.Person;
import com.example.jpaRelationships.repoOneToOne.PassportRepository;
import com.example.jpaRelationships.repoOneToOne.PersonRepository;

@Component
public class AppRunner implements CommandLineRunner {
	private final PersonRepository personRepository;
	private final PassportRepository passportRepository;
	

	public AppRunner(PersonRepository personRepository, PassportRepository passportRepository) {
		this.personRepository = personRepository;
		this.passportRepository = passportRepository;
	
	}

	@Override
	public void run(String... args) {
		// 🔹 One-to-One
		Person person = new Person();
		person.setName("John Doe");
		personRepository.save(person);

		Passport passport = new Passport();
		passport.setPassportNumber("A1234567");
		passport.setPerson(person);
		passportRepository.save(passport);

		System.out.println("One-to-One: " + passportRepository.findAll());

		
	}
}
