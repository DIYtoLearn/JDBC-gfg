package com.digLib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digLib.DTOs.LoginDTO;
import com.digLib.DTOs.UserRegisterRequest;
import com.digLib.entities.User;
import com.digLib.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/user")
public class UserController
{
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody @Valid UserRegisterRequest request)
	{
		userService.register(request);
		
		return ResponseEntity.ok("user registered successfully");
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> register(@RequestBody @Valid LoginDTO loginDTO)
	{
		User user=userService.login(loginDTO.getEmail(), loginDTO.getPassword());
		
		return ResponseEntity.ok("user login successfull "+user.getName());
	}
	

}
