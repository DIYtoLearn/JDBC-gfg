package com.gl.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gl.beans.Book;
import com.gl.config.BookRowMapper;

@Repository(value="bDao")
public class BookDaoImpl implements BookDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int saveBook(Book book)
	{
		String query="Insert Into book(bid,bname,bauthor,bdes) values(?,?,?,?)";
		return jdbcTemplate.update(query,book.getBid(),book.getBookName(),book.getBookAuthor(),book.getBookDescription());
	}

	@Override
	public int deleteBook(int bid)
	{
		String query="delete from book where bid=?";
		return jdbcTemplate.update(query,bid);
	}

	@Override
	public int updateBook(int bid,Book book) 
	{
		String query="update book set bname=?,bauthor=?,bdes=? where bid=?";
		System.out.println(book.getBookName());
		return jdbcTemplate.update(query,book.getBookName(),book.getBookAuthor(),book.getBookDescription(),bid);
	}

	@Override
	public int searchBook(int bid)
	{
		String query = "select * from book where bid=?";
		try
		{
			Book book = jdbcTemplate.queryForObject(query,new BookRowMapper(), bid);
			return book.getBid();
		}catch(Exception e)
		{
			return -1;
		}
	}

	@Override
	public List<Book> getBooks() 
	{
		String query = "select * from book";
		return jdbcTemplate.query(query,new BookRowMapper());
	}

}
