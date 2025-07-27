package com.digLib.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.digLib.service.CustomUserDetailsService;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig
{
	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(AbstractHttpConfigurer::disable)
		.authorizeHttpRequests(auth -> 
		auth
		.requestMatchers("/api/v1/user/register").permitAll()
		.requestMatchers("/admin").hasRole("ADMIN")
		.requestMatchers("/user").hasRole("USER")
		.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.formLogin(AbstractHttpConfigurer::disable);



		return http.build();

	}


	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception{
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailsService)
				 .passwordEncoder(new BCryptPasswordEncoder())
				  .and()
				   .build();
	}


}
