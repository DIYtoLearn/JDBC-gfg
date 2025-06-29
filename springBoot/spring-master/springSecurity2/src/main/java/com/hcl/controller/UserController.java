package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entities.User;
import com.hcl.servcie.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserService service;



  
	@PostMapping(value="/register",consumes=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<User> registerUser(@RequestBody User user)
	{

		User u=service.userRegister(user); 
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	 
	}

	// @PreAuthorize("hasAuthority('USER')")
	@GetMapping("/res")
	public String showReg()
	{
		return "only for users";
	}

 // @PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update")
	public String update()
	{
		return "api updated for admin";
	}
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete")
	public String delete()
	{
		return "api deleted by admin";
	}




}
