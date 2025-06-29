package com.gl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gl.beans.Todo;
import com.gl.config.RowMapperImpl;

@Component
public class TodoDaoImpl implements TodoDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int saveTodo(Todo todo) {
	String insertQuery= "insert into todo (id,title,description) values(?,?,?)";
	int updatedRows=jdbcTemplate.update(insertQuery,todo.getId(),todo.getTitle(),todo.getDescription());
		return updatedRows;
	}

	@Override
	public int updateTodo(Todo todo) {
		String updateQuery= "update todo set title=? , description=? where id=?";
		int updatedRows=jdbcTemplate.update(updateQuery,todo.getTitle(),todo.getDescription(),todo.getId());
			return updatedRows;
	}

	@Override
	public int deleteTodo(int id) {
		String deleteQuery= "delete from todo where id=?";
		int updatedRows=jdbcTemplate.update(deleteQuery,id);
		return updatedRows;
	}

	@Override
	public Todo getTodo(int id) {
		String selectQuery="select * from todo where id=?";
		Todo todo=jdbcTemplate.queryForObject(selectQuery,new RowMapperImpl(),id);
		return todo;
	}

	@Override
	public List<Todo> getAllTodos() {
		String selectQuery="select * from todo";
		List<Todo> todos=jdbcTemplate.query(selectQuery,new RowMapperImpl());
		return todos;
	}
	
	
	
	

}
