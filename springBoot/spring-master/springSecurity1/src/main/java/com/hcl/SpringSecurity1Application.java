package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class SpringSecurity1Application implements CommandLineRunner{

	
	
//	@Autowired
//	 BCryptPasswordEncoder encoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity1Application.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
//		String s= "syedsaqib@123";
//		System.out.println("my encoded password ="+encoder.encode(s));;
		
	}
	
	

}
