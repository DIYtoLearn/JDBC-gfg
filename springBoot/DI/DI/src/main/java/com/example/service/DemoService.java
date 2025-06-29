package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.DemoRepository2;
import com.example.repository.Repository1;

@Service
public class DemoService
{
	@Autowired
	@Qualifier("repo2")
	Repository1 repo;
	
	public String getData()
	{
		return repo.getData();
	}

}
