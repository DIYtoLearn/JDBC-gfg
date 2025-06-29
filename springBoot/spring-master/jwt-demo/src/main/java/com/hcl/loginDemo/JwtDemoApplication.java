package com.hcl.loginDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@CrossOrigin(origins="http://localhost:4200")
@SpringBootApplication
public class JwtDemoApplication  {

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
	
	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

		
	
	

}
