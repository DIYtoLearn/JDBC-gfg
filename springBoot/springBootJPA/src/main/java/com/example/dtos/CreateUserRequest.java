package com.example.dtos;

import com.example.entities.Gender;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateUserRequest 
{
	@NotBlank(message="name is required")
	@Size(max=100,message="name must be less than 100 chars")
	private String name;
	
	@Email(message="email should be in proper format")
	private String email;
	
	private Gender gender;
	
	

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
