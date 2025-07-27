package com.digLib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digLib.entities.BorrowRecord;
import com.digLib.service.BorrowService;

@RestController
@RequestMapping("api/v1/borrow")
public class BorrowController
{
	@Autowired
	private BorrowService borrowService;
	
	@PostMapping("/{bookId}/user/{userId}")
	public void borrowBook(@PathVariable(name="bookId") int bookId,@PathVariable(name="userId") int userId)
	{
		borrowService.borrowBook(bookId, userId);
	}
	
	@PostMapping("return/{bookId}/user/{userId}")
	public void returnBook(@PathVariable(name="bookId") int bookId,@PathVariable(name="userId") int userId)
	{
		borrowService.returnBook(bookId, userId);
	}
	
	@GetMapping("/history/{userId}")
	public List<BorrowRecord> getBorrowHistory(@PathVariable(name="userId") int userId)
	{
		return borrowService.getBorrowHostory(userId);
	}
	

}
