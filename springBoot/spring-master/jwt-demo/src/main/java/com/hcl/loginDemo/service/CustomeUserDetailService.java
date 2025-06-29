package com.hcl.loginDemo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.loginDemo.beans.User;
import com.hcl.loginDemo.repo.UserRepo;

@Service
public class CustomeUserDetailService implements UserDetailsService
{
	@Autowired
	UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user= repo.findByUserName(userName);
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),new ArrayList()) ;
	}
	
	
	

}
