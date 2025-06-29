package com.gl.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gl.beans.User;
import com.gl.config.UserRowMapper;

@Repository(value="uDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int checkuser(User user)
	{
		String query="Select * From user where username=? and pass=?";
		try {
		User foundUser=jdbcTemplate.queryForObject(query, new UserRowMapper(),user.getUserName(),user.getUserpassword());
		return foundUser.getUserId();
		}catch(Exception e)
		{
			return -1;
		}
	}
	
	@Override
	public int saveUser(User user)
	{
		String query="Insert Into user(username,email,pass) values(?,?,?)";
		return jdbcTemplate.update(query,user.getUserName(),user.getEmail(),user.getUserpassword());
	}
	
}
