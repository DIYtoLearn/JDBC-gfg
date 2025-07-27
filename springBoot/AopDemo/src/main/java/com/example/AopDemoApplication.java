package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.service.BusinessClass;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopDemoApplication implements CommandLineRunner {

	@Autowired
   BusinessClass bc;
	
	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		bc.bookTicket();
		
	}

}
