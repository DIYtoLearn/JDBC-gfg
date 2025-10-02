package com.digLib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {
	
	
	@GetMapping("/admin")
	public String getAdmin() {

		return "welcome admin";
	}
	
	@GetMapping("/user")
	public String getUser() {

		return "welcome user";
	}
	
	@GetMapping("/greet")
	public String getAll() {

		return "welcome all";
	}

}
