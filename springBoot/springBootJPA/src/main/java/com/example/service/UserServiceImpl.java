package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public User getUserById(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public User updateUser(User user, int id) {
		
		User userUpdated= null;
		if(repo.findById(id).isPresent())
		{
			userUpdated=repo.save(user);
		}
		
		return userUpdated ;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean deleted=false;
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			deleted= true;
		}
		
		return deleted;
	}

	@Override
	public User searchUserByEmail(String email) {
		
		return repo.findByEmail(email);
	}

}
