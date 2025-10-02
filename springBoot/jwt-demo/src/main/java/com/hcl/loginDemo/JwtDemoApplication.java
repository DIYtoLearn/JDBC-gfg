package com.hcl.loginDemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hcl.loginDemo.beans.User;
import com.hcl.loginDemo.service.UserService;

//@CrossOrigin(origins="http://localhost:4200")
@SpringBootApplication
public class JwtDemoApplication  {


	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

		
	
	

}
