package com.hcl.loginDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.hcl.loginDemo.beans.User;

public interface UserRepo extends CrudRepository <User,String>
{

	User findByUserName(String userName);
	

}
