package com.digLib.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.digLib.DTOs.UserRegisterRequest;
import com.digLib.entities.Role;
import com.digLib.entities.User;
import com.digLib.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	
	@Override
	public void register(UserRegisterRequest request)
	{
		if(userRepo.findByUsername(request.getUsername()).isPresent())
		{
			throw new RuntimeException("email already registered");
		}
		
		HashSet roles = new HashSet();
		Role role = new Role();
		role.setName("USER");
		roles.add(role);
		User user = new User().builder().username(request.getUsername()).password(encoder.encode(request.getPassword())).enabled(true).roles(roles).build();
	
		userRepo.save(user);
		
	}

	@Override
	public User login(String email, String password)
	{
	
		return userRepo.findByUsername(email).filter(u->u.getPassword().equals(password)).orElseThrow(()->new RuntimeException("Invalid Credentials"));
		
	}

}
