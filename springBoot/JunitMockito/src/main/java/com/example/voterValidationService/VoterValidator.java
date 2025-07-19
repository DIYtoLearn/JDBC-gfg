package com.example.voterValidationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voterValidationRepo.VoterRepo;

@Service
public class VoterValidator 
{
	
	@Autowired
	VoterRepo repo;
	
	public boolean validateVoterAge(int age) throws InvalidVoterException
	{
		boolean result= false;
		
		if(age<0)
		{
			throw new InvalidVoterException("enter a valid age");
		}
		
		if(age>=18)
		{
			result=true;
		}
		else
		{
			result =false;
		}
		return result;
	}
	
	
	public String getVoterId(int id)
	{
	   	return repo.getVoterId( id);
	   	
	}
	
	

}
