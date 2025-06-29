package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.beans.Todo;
import com.gl.dao.TodoDao;

@Controller
public class TodoController 
{
	List<Todo> l;
	
	@Autowired
	private TodoDao dao;
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login(@RequestParam String username,@RequestParam String password)
	{
	   	  ModelAndView m= new ModelAndView(); 
	}
	
	@RequestMapping(value="/registertion",method=RequestMethod.GET)
	public void registeration(@RequestParam String username,@RequestParam String password)
	{
	   	  ModelAndView m= new ModelAndView(); 
	}


	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model m)
	{
		m.addAttribute("page","home");
		if(l==null)
		{
			l.add(new Todo(0,"",""));
			 m.addAttribute("todos",l);
		}
		else {
			l= dao.getAllTodos();
        m.addAttribute("todos",l);
		}
		return "home";
	}
	@RequestMapping("/add")
	public String addTodo(Model m)
	{
		Todo t = new Todo();
        l.add(t);
		m.addAttribute("page","add");
		m.addAttribute("todo",t);

		return "home";
	}
	
	@RequestMapping("/update")
	public String update(Model m)
	{
		Todo t = new Todo();
		l.add(t);
		m.addAttribute("page","update");
		m.addAttribute("todo",t);

		return "home";
	}
	@RequestMapping("/delete")
	public String delete(Model m)
	{
		int id=0;
		m.addAttribute("page","delete");
		

		return "home";
	}
	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String addTodo(@ModelAttribute("todo") Todo t,Model m)
	{
		l.add(t);
		dao.saveTodo(t);
		System.out.println(t);

		return "home";
	}
	@RequestMapping(value="/updateTodo",method=RequestMethod.PUT)
	public String updateTodo(@ModelAttribute("todo") Todo t,Model m)
	{
		dao.updateTodo(t);
		System.out.println(t);

		return "home";
	}
	@RequestMapping(value="/DeleteTodo",method=RequestMethod.DELETE)
	public String addTodo(@RequestParam("id") int id,Model m)
	{
		dao.deleteTodo(id);
		

		return "home";
	}

}
