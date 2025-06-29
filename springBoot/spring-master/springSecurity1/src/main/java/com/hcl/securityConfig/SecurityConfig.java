package com.hcl.securityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
   	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("saqib").password("{noop}saqib123").authorities("ADMIN");
	auth.inMemoryAuthentication().withUser("sai").password("{noop}sai123").authorities("CUST");
	auth.inMemoryAuthentication().withUser("priya").password("{noop}priya123").authorities("EMP");
	}
	
	protected void configure(HttpSecurity http) throws Exception 
	{
		  //URL-Accss Type
		 http.authorizeRequests()
		 .antMatchers(HttpMethod.GET,"/home").permitAll()
		 .antMatchers("/welcome").authenticated()
		 .antMatchers("/admin").hasAuthority("ADMIN")
		 .antMatchers("/emp").hasAuthority("EMP")
		 .antMatchers("/cust").hasAuthority("CUST")
		  //LoginForm Detail
		 .and()
		 .formLogin()
		  .defaultSuccessUrl("/welcome",true)
		  // Logout Detail
		  
		  .and()
		  .logout()
		  .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		  //exception Detail
	}

	
	
	
	
	
	
	
	
	
	
	
//	@Bean
//	public BCryptPasswordEncoder pwdEncoder()
//	{
//		return new  BCryptPasswordEncoder();
//	}

}
