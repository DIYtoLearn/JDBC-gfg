package com.hcl.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hcl.entities.User;

public interface UserRepo extends CrudRepository<User,Integer> 
{

	Optional<User> findByUsername(String username);
	

}
