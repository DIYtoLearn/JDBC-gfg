package com.hcl.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hcl.autowiring.Address;

@Configuration
@ComponentScan("com.hcl.annotationBased")
public class CustmConfig 
{

	@Bean("addr")
	public Address getAddress()
	{
		return new Address();
	}
	  
}
