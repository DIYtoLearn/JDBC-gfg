package com.hcl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hcl.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	CustomUserDetailsService  userDetailsService;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
	//	auth.inMemoryAuthentication().withUser("saqib").password("{noop}saqib123").authorities("ADMIN");
		
		auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
	}
	
	protected void configure(HttpSecurity http) throws Exception 
	{
		
	     http.csrf().disable()
		 .authorizeRequests()
		 .antMatchers(HttpMethod.GET).hasAuthority("USER")
		 .antMatchers(HttpMethod.POST,"/user/register").hasAuthority("ADMIN")
		 .antMatchers(HttpMethod.PUT,"/user/update").hasAuthority("CUSTOMER")
     	 .antMatchers(HttpMethod.DELETE,"/user/delete").hasAuthority("ADMIN");
	     super.configure(http);
		
    	 
	}
	

	

}
