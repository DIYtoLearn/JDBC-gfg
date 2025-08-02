package com.example;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringOAuth2GithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOAuth2GithubApplication.class, args);
	}
	
	@GetMapping("/")
	public String message(Principal principal)
	{
		System.out.println(principal);
		return "Hello "+principal.getName();
		
	}

	
	@GetMapping("/user")
	public String message(OAuth2AuthenticationToken auth)
	{
		return "Hello "+auth.getPrincipal().getAttribute(auth.getName());
		
	}

}
