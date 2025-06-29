package com.gl.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gl.beans.User;

public class UserRowMapper implements RowMapper<User>
{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		User user = new User();
		user.setUserId(rs.getInt(1));
		user.setUserName(rs.getString(2));
		return user;
	}

}
