package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // @Autoconfiguration + @Configuration + @ComponentScan
@RestController
public class SpringBootDemo1Application 
{
	
	@GetMapping("/")
	public String greet()
	{
		return "Hello World";
	}
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootDemo1Application.class, args);
	    
	}
}
