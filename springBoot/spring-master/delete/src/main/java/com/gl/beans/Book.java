package com.gl.beans;


public class Book
{
	private int bid;
	private String bookName;
	private String bookAuthor;
	private String bookDescription;
	
	public Book() {
		super();
	}
	
	public Book(int bid, String bookName, String bookAuthor, String bookDescription) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookDescription = bookDescription;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	
	
}
		