package com.gl.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gl.bean.Todo;
import com.gl.config.RowMapperImpl;

@Repository("dao")
public class TodoDaoImpl implements TodoDao
{
	
	
	private JdbcTemplate jdbcTemplate;
	

	@Autowired
	public TodoDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		
	}

	public int saveTodo(Todo todo) {
	String insertQuery= "insert into todo (id,title,description) values(?,?,?)";
	int updatedRows=jdbcTemplate.update(insertQuery,todo.getId(),todo.getTitle(),todo.getDescription());
		return updatedRows;
	}

	public int updateTodo(Todo todo) {
		String updateQuery= "update todo set title=? , description=? where id=?";
		int updatedRows=jdbcTemplate.update(updateQuery,todo.getTitle(),todo.getDescription(),todo.getId());
			return updatedRows;
	}

	public int deleteTodo(int id) {
		String deleteQuery= "delete from todo where id=?";
		int updatedRows=jdbcTemplate.update(deleteQuery,id);
		return updatedRows;
	}

	public Todo getTodo(int id) {
		String selectQuery="select * from todo where id=?";
		Todo todo=jdbcTemplate.queryForObject(selectQuery,new RowMapperImpl(),id);
		return todo;
	}

	public List<Todo> getAllTodos() {
		String selectQuery="select * from todo";
		List<Todo> todos=jdbcTemplate.query(selectQuery,new RowMapperImpl());
		return todos;
	}
	

	
	
	
	

}
