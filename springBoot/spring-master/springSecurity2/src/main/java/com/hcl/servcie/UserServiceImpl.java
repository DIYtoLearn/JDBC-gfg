package com.hcl.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hcl.entities.User;
import com.hcl.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService
{
   @Autowired
   UserRepo repo;
   
   @Autowired
   BCryptPasswordEncoder encoder;
   
	@Override
	public User userRegister(User u) {
		u.setPassword(encoder.encode(u.getPassword()));
		return repo.save(u);
	}

	

}
