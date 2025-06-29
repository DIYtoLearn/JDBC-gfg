package com.gl.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gl.beans.Book;

public class BookRowMapper implements RowMapper<Book>
{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Book book =new Book();
		book.setBid(rs.getInt(1));
		book.setBookName(rs.getString(2));
		book.setBookAuthor(rs.getString(3));
		book.setBookDescription(rs.getString(4));
		
		return book;
	}

}
