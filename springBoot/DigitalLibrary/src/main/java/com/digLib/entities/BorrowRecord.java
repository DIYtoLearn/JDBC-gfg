package com.digLib.entities;

import java.time.LocalDate;

import jakarta.persistence.ManyToOne;

public class BorrowRecord
{
	private int id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Book book;
	
	private LocalDate borrowDate;
	
	private LocalDate returnDate;
	
	private boolean returned;

}
