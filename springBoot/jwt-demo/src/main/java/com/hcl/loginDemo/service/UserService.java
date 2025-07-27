package com.hcl.loginDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.loginDemo.beans.User;
import com.hcl.loginDemo.repo.UserRepo;

@Service
public class UserService 
{
	@Autowired
	UserRepo repo;
	
	@Autowired
	BCryptPasswordEncoder bpe;
	
	public void addUser(User user)
	{
		user.setPassword(bpe.encode(user.getPassword()));
		
		repo.save(user);
	}

}
