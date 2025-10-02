package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entities.Contacts;
import com.example.entities.User;
import com.example.repository.UserRepo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserService 
{
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	RestTemplate template;
	
	public User addUser(User user)
	{
		return repo.save(user);
	}
	
	@CircuitBreaker(name="userService", fallbackMethod="userContactsFallback")
	public User getUserById(int id) {
		User user= repo.findById(id).get();
		List<Contacts> contacts =template.getForObject("http://contacts-ms/api/contacts/"+id, List.class);
	    user.setContact(contacts);
	    return user;
	}
	
	
	public User userContactsFallback(int userId ,Throwable t)
	{
	  System.out.println("Service currently unavailable, Please try again later :( ");	
	  return new User();
	}
	

	public List<User> getAll() {
		
		return repo.findAll();
	}

}
