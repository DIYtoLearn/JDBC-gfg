package com.digLib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig
{

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(auth -> 
		auth.requestMatchers("/admin").hasRole("ADMIN")
		.requestMatchers("/user").hasRole("USER")
		.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.formLogin(AbstractHttpConfigurer::disable);



		return http.build();

	}


	@Bean
	public UserDetailsService users()
	{
		UserDetails admin = User.withUsername("Syed").password("{noop}Syed@123").roles("ADMIN").build();
		UserDetails user1 = User.withUsername("Sarfaraz").password("{noop}Sarfaraz@123").roles("USER").build();
		UserDetails user2 = User.withUsername("Anusha").password("{noop}Anusha@123").roles("USER").build();

		return new InMemoryUserDetailsManager(admin,user1,user2);

	}


}
