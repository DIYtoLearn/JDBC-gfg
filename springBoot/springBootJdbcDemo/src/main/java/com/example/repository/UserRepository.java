package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.example.models.User;

@Repository
public class UserRepository 
{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class UserRowMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setName(rs.getString("name"));
			return user;
		}
		
	}
	
	
	public List<User> findAll()
	{
			return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
	}
	
	public User findById(int id)
	{
		return jdbcTemplate.queryForObject("select * from users where id=?", new Object[] {id},new BeanPropertyRowMapper<User>(User.class));
	}

	
	public int deleteById(int id)
	{
		return jdbcTemplate.update("delete from users where id=?", new Object[] {id});
	}
	
	public int update(User user)
	{
		return jdbcTemplate.update("update users set email=? ,name = ? where id = ?", new Object[] {user.getEmail(),user.getName(),user.getId()});
	}
	
	public int insert(User user)
	{
		return jdbcTemplate.update("INSERT INTO users (name,email) VALUES (?,?)", new Object[] {user.getEmail(),user.getName()});
	}
	
	public User getUserById(int id)
	{
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("sp_get_user_by_id")
				.returningResultSet("result",new BeanPropertyRowMapper<User>(User.class));
		
		 Map result=jdbcCall.execute(Map.of("in_id",id));
		 
		List<User> user= (List<User>) result.get("result");
		
		return user.isEmpty()? null : user.get(0);
		
	}
		
}

	
	

