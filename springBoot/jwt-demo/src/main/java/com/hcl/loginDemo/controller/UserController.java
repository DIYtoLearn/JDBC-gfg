package com.hcl.loginDemo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.loginDemo.beans.AuthRequest;
import com.hcl.loginDemo.jwtUtil.JwtUtil;

@RestController
public class UserController 
{
	
	@Autowired 
	JwtUtil jwtUtil;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome Dear User";
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/login")
	public String  loginUser(@RequestBody AuthRequest authRequest) throws Exception
	{
       try {
    	   authenticationManager
   		.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName()
   				,authRequest.getPassword()));
	} catch (Exception e) {
		throw new Exception("invalid credentials");
	}
		return jwtUtil.generateToken(authRequest.getUserName());
	}
	
	

}
