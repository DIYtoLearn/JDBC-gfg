package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.models.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class SpringBootJdbcDemoApplication implements CommandLineRunner {

	@Autowired
	UserRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(	repo.findAll());
//		System.out.println(	repo.findById(7));
		
//		User user=new User();
//		user.setName("raju");
//		user.setEmail("raju@gmail.com");
//		System.out.println(	repo.insert(user));
		
//		User userUpdate=new User();
//		userUpdate.setId(7);
//		userUpdate.setName("rajuNew");
//		userUpdate.setEmail("rajuNew@gmail.com");
//		
//		System.out.println(repo.update(userUpdate));
		
		//repo.deleteById(7);	
		
//		System.out.println(repo.getUserById(1));
		
		
	}

}
