package com.example.jpaRelationships;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpaRelationships.entityManyToOne.Company;
import com.example.jpaRelationships.entityManyToOne.Worker;
import com.example.jpaRelationships.repoManyToOne.CompanyRepository;
import com.example.jpaRelationships.repoManyToOne.WorkerRepository;

@Component
public class AppRunner implements CommandLineRunner {
	
	private final CompanyRepository companyRepository;
	private final WorkerRepository workerRepository;


	public AppRunner(
			CompanyRepository companyRepository, WorkerRepository workerRepository) {
			
		this.companyRepository = companyRepository;
		this.workerRepository = workerRepository;
	}

	@Override
	public void run(String... args) {
	

		// 🔹 Many-to-One
		Company company = new Company();
		company.setName("TechCorp");
		companyRepository.save(company);

		Worker worker = new Worker();
		worker.setName("Charlie");
		worker.setCompany(company);
		workerRepository.save(worker);

		System.out.println("Many-to-One: " + workerRepository.findAll());

	}
}
