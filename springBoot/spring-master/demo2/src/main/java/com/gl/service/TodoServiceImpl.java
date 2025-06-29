package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gl.bean.Todo;
import com.gl.repo.TodoDaoImpl;

@Service("service")
public class TodoServiceImpl implements TodoService {

	
	@Autowired
	@Qualifier("dao")
	private TodoDaoImpl dao;
	
	public int saveTodo(Todo todo) {
		
		return  dao.saveTodo(todo);
	}

	public int updateTodo(Todo todo) {
		
		return dao.updateTodo(todo);
	}

	public int deleteTodo(int id) {
		
		return dao.deleteTodo(id);
	}

	public Todo getTodo(int id) {
		
		return dao.getTodo(id);
	}

	public List<Todo> getAllTodos() {
	
		return dao.getAllTodos();
	}

}
