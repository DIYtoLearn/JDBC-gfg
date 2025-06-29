package com.gl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.bean.Todo;
import com.gl.repo.TodoDaoImpl;

@Controller
@RequestMapping("/todo")
public class TodoController 
{
	
	private TodoDaoImpl dao;

	@Autowired
	public TodoController(TodoDaoImpl dao) {
		this.dao=dao;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public void save(@RequestParam int id,@RequestParam String title,@RequestParam String description)
	{
		Todo t = new Todo(id,title,description);
	     dao.saveTodo(t);	
	}

	
}
