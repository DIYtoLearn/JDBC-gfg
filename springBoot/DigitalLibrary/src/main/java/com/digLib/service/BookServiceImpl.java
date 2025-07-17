package com.digLib.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digLib.DTOs.BookDTO;
import com.digLib.entities.Book;
import com.digLib.repository.BookRepository;
import com.digLib.util.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
	
		return bookRepo.findAll();
	}

	@Override
	public Book addBook(BookDTO bookDTO) {
		
		
		Book b = new Book().builder().title(bookDTO.getTitle()).author(bookDTO.getAuthor()).available(true).category(bookDTO.getCategory()).isbn(bookDTO.getIsbn()).build();
		return bookRepo.save(b);
	}

	@Override
	public String deleteBook(int id) {
		String result="book not found with id"+id;
		try {	
				bookRepo.deleteById(id);
				result = "book deleted with id "+id;
			
			
		} catch (Exception e) 
		{
			throw new BookNotFoundException("book not found with id"+id);		
		}
		return result;

		
	}

	@Override
	public Book updateBook(int id, BookDTO bookDTO) {
		Book result=null;
		try {	
				
				result = bookRepo.save(new Book().builder().title(bookDTO.getTitle()).author(bookDTO.getAuthor()).available(true).category(bookDTO.getCategory()).isbn(bookDTO.getIsbn()).build());
			
			
		} catch (Exception e) 
		{
			throw new BookNotFoundException("book not found with id"+id);		
		}
		return result;

		
	}

	@Override
	public List<Book> searchBooks(String title,String author,String isbn,String category)
	{
		if(isbn!=null && !isbn.isEmpty())
		{
			return bookRepo.findByIsbn(isbn).map(List::of).orElse(Collections.emptyList());
		}
		
		if(title!=null && !title.isEmpty())
		{
			return bookRepo.findByTitleContainingIgnoreCase(title);
		}
		if(author!=null && !author.isEmpty())
		{
			return bookRepo.findByAuthorIgnoreCase(author);
		}
		if(category!=null && !category.isEmpty())
		{
			return bookRepo.findByCategoryIgnoreCase(category);
		}
		return bookRepo.findAll();	
		
	}

}
