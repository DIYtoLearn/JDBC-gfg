package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.User;


public interface UserRepository extends JpaRepository<User,Integer>
{

	User findByEmail(String email);
	
//	@Query(value="select * from users where name = ?1 and email=?2",nativeQuery=true)
//	User findByNameAndEmail(String name,String email);
////	
//	@Query(value="select u from users u where u.name = ?1 or u.email=?2")
//	User findByNameOrEmail(String name,String email);
	
//	@NativeQuery(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1")
//	User findByNameOr(String email);
}

	
	

