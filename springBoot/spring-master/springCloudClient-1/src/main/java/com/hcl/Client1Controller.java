package com.hcl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Client1Controller {

	@Value("${my.greeting}")
	private String greeting;
	
	@Value("${my.list.values}")
	private List<String> alphas;
	
	@GetMapping("/greet")
	public String greet()
	{
		return greeting;
	}
	
	@GetMapping("/alphas")
	public List<String> alphas()
	{
		return alphas;
	}

	
}
