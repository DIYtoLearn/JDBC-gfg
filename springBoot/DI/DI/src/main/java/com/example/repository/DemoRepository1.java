package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository("repo1")
public class DemoRepository1 implements Repository1
{
	
	public String getData()
	{
		return "Data...1";
	}

}
