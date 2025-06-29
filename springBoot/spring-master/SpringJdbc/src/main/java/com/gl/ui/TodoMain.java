package com.gl.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gl.beans.Todo;
import com.gl.config.JdbcConfig;
import com.gl.dao.TodoDao;
import com.gl.dao.TodoDaoImpl;

public class TodoMain 
{
	public static void main(String[] args)
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
		TodoDao dao=context.getBean(TodoDaoImpl.class);
		
		Todo todo = new Todo(3,"task3","task3");
		
		//dao.saveTodo(todo);
		
		//Todo todo1 = new Todo(2,"task2","coding");
		//dao.updateTodo(todo1);
		
		// dao.deleteTodo(2);
		
		//System.out.println(dao.getTodo(1));
		List<Todo> todos= dao.getAllTodos();
		for(Todo t:todos)
		{
			System.out.println(t);
		}
		
		
		
		
		
	}

}
