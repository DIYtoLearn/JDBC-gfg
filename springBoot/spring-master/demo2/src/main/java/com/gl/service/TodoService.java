package com.gl.service;

import java.util.List;

import com.gl.bean.Todo;

public interface TodoService
{
	public int saveTodo(Todo todo);
	public int updateTodo(Todo todo);
	public int deleteTodo(int id);
	public Todo getTodo(int id);
	public List<Todo> getAllTodos();
}
