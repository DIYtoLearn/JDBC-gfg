package com.example.service;

import java.util.List;

import com.example.entities.User;

public interface UserService 
{
	User getUserById(int id);
	List<User> getAllUsers();
	User addUser(User user);
	User updateUser(User user,int id);
	boolean deleteUser(int id);
	User searchUserByEmail(String email);
	
}
