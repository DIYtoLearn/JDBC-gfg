package com.hcl.servcie;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.entities.User;
import com.hcl.repo.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService {

	 @Autowired
	   UserRepo repo;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=null;
		try {
			 user= repo.findByUsername(username).orElseThrow(()->new Exception("user not found"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), 
			
			user.getRoles().stream().map(role->new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList())
			);
	
	}

}
