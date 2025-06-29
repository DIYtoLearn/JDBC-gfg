package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.DemoService;

@Controller
public class DemoController
{
	@Autowired
	DemoService service;
	
	
	public String getData()
	{
		return service.getData();
	}

}
