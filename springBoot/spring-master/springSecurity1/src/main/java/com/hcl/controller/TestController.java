package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String testHome() {
		return "home";
	}
	@GetMapping("/welcome")
	public String testWelcome() {
		return "welcome";
	}
	@GetMapping("/admin")
	public String testAdmin() {
		return "admin";
	}
	@GetMapping("/emp")
	public String testEmp() {
		return "employee";
	}
	@GetMapping("/cust")
	public String testCustomer() {
		return "customer";
	}

}
