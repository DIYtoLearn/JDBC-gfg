package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.CreateUserRequest;
import com.example.entities.User;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> users=service.getAllUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/getAll/search")
	public ResponseEntity<User> getAllUsersByEmail(@RequestParam String email)
	{
		User users=service.searchUserByEmail(email);
		return new ResponseEntity<User>(users,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserRequest request,BindingResult result)
	{
		List<Map<String,String>> errors = new ArrayList<>();
		
		if(result.hasErrors())
		{
			for (FieldError fieldError:result.getFieldErrors())
			{
				Map<String,String> error = new HashMap();
				error.put("field", fieldError.getField());
				error.put("message",fieldError.getDefaultMessage());
				errors.add(error);
			}
			return ResponseEntity.badRequest().body(Map.of("errors",errors));
		}
		
		User user=service.addUser(new User(request.getName(),request.getEmail(),request.getGender()));
		
		return new ResponseEntity(user,HttpStatus.CREATED);
		
		
	}

}
