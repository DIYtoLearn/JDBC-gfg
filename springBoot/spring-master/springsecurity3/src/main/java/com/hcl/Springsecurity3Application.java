package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.service.CustomUserDetailsService;

@SpringBootApplication
public class Springsecurity3Application implements CommandLineRunner {

	@Autowired
	CustomUserDetailsService service;
	//	
	//	@PostConstruct
	//	public void init()
	//	{
	//		Roles r1= new Roles(1,"ADMIN");
	//		Roles r2= new Roles(2,"USER");
	//		List<Roles> roles= new ArrayList();
	//		roles.add(r1);
	//		roles.add(r2);
	//		
	//      	User user =	new User(1,"test","test",roles);
	//      	service.userRegister(user);
	//	}
	//	
	public static void main(String[] args) {
		SpringApplication.run(Springsecurity3Application.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.loadUserByUsername("saqib"));

	}

}
