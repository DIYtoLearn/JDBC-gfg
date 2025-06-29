package com.gl.repo;

import java.util.List;

import com.gl.beans.Book;

public interface BookDao {
	public int saveBook(Book book);
	public int deleteBook(int bid);
	int searchBook(int bid);
	int updateBook(int bid, Book book);
	List<Book> getBooks();

}
