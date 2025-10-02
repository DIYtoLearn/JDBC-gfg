package com.hcl.loginDemo.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hcl.loginDemo.beans.User;
import com.hcl.loginDemo.service.UserService;

@Configuration
public class InitConfig {
//	@Autowired
//	UserService service;
//	
//	@PostConstruct
//	public void addUsers()
//	{
//		User user =  new User("abcd","abcd@123");
//		service.addUser(user);
//		
//	}
	 @Bean
	    public WebMvcConfigurer corsConfigurer()
	    {
	    	return new WebMvcConfigurer() {
	    		@Override
	    		public void addCorsMappings(CorsRegistry registry)
	    		{
	    			registry.addMapping("/*").allowedHeaders("*").allowedOrigins("*");
	    		  
	    		}
	    	};
	    }
	
}
