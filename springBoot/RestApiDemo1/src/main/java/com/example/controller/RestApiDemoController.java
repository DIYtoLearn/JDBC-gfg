package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.User;

@RestController
@RequestMapping("/api")
public class RestApiDemoController
{

	@GetMapping("/greet")
	public ResponseEntity<String> greet()
	{
		return new ResponseEntity<String>("Hello world",HttpStatus.OK);
	}

	@GetMapping("/greet/{id}")
	public ResponseEntity<String>  greet(@PathVariable int id)
	{

		try {
			if (id==1)
				return new ResponseEntity<String>("details of user "+id,HttpStatus.OK);
			else
				throw new RuntimeException("");
		} catch (Exception e) {
			return new ResponseEntity<String>("no user found with id "+id,HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("/greet/search")
	public String greet(@RequestParam String searchParam)
	{
		return " search results for "+searchParam;
	}

	@PostMapping("/greet")
	public User login(@RequestBody User user)
	{
		return user;
	}

	@PutMapping("/greet")
	public User changePassword(@RequestBody User user)
	{
		return user;
	}

	@DeleteMapping("/greet/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return "user deleted with id "+id;
	}




}
