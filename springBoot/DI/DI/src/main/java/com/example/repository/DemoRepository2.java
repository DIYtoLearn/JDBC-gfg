package com.example.repository;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Repository;

@Repository("repo2")
public class DemoRepository2 implements Repository1
{
	
	public String getData()
	{
		return "Data...2";
	}

	
}