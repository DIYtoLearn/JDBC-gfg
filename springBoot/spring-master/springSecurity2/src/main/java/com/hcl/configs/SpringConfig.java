package com.hcl.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.hcl.servcie.CustomUserDetailService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SpringConfig extends WebSecurityConfigurerAdapter
{
	

	@Autowired
	private CustomUserDetailService userService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
//	@Bean(name=BeanIds.AUTHENTICATION_MANAGER)
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception{
//		return super.authenticationManagerBean();
//	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
//		auth.inMemoryAuthentication().withUser("saqib").password("{noop}saqib123").authorities("ADMIN");
//		auth.jdbcAuthentication()
//		.dataSource(dataSource)
//		.usersByUsernameQuery("select username,password,uenabled from user where username=?")
//		.authoritiesByUsernameQuery("select roles from user where username=?")
//		.passwordEncoder(passwordEncoder);
		System.out.println("from config auth ");
		auth.userDetailsService(this.userService).passwordEncoder(this.passwordEncoder);
	}
	
//	protected void configure(HttpSecurity http) throws Exception 
//	{
//		
//	     http.csrf().disable()
//		 .authorizeRequests()
//		  .antMatchers(HttpMethod.GET).hasAuthority("USER")
//		  .antMatchers(HttpMethod.POST,"/user/register").hasAuthority("ADMIN")
//		 .antMatchers(HttpMethod.PUT,"/user/update").hasAuthority("ADMIN")
//		 .antMatchers(HttpMethod.DELETE,"/user/delete").hasAuthority("ADMIN");
//	     super.configure(http);
//		
//    	 
//	}
		  //URL-Accss Type
		
//		 http.csrf().disable()
//		 .authorizeHttpRequests()
//		 .anyRequest()
//		 .authenticated()
//		 .and()
//		 .httpBasic();
//		 .authorizeRequests()
//		 .antMatchers(HttpMethod.POST).permitAll()
//     	 .antMatchers(HttpMethod.GET).hasRole("ADMIN")
//		 .antMatchers(HttpMethod.GET).hasRole("USER")
//		
		 
		  //LoginForm Detail
//		 .and()
//		 .formLogin()
//		  .defaultSuccessUrl("/success",true)
//		  // Logout Detail
//		  
//		  .and()
//		  .logout()
//		  .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//		  //exception Detail
//		 .and().exceptionHandling().accessDeniedPage("/error");
//	
//	}


}
