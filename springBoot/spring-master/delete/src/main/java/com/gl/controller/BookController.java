package com.gl.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.beans.Book;
import com.gl.repo.BookDao;

@Controller
public class BookController
{
	@Autowired
	private BookDao bDao;
	
	@PostMapping("/addBook")
	public ModelAndView addBook(HttpServletRequest req,@RequestParam("bid") Integer bid)
	{
//		System.out.println(bid);
		
		Book book = new Book();
		book.setBid(Integer.parseInt(req.getParameter("bid")));
		book.setBookName(req.getParameter("bname"));
		book.setBookAuthor(req.getParameter("bAuthor"));
		book.setBookDescription(req.getParameter("des"));
		
		int rowAffected=bDao.saveBook(book);
		if(rowAffected>0)
		{
			ModelAndView mv = new ModelAndView("addBookForm.jsp");
			mv.addObject("msg",book.getBookName()+" Added to Library");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("dashboard.jsp");
			mv.addObject("msg","Some problem occured Book not added");
			return mv;
		}
	}
	
	@PostMapping("/updateBook")
	public ModelAndView updateBook(HttpServletRequest req)
	{
		int bid=Integer.parseInt(req.getParameter("bid"));
		ModelAndView mv = new ModelAndView("updateBookForm.jsp");
		int cBid = bDao.searchBook(bid);
		if(cBid>0)
		{
			Book book=new Book();
			book.setBookName(req.getParameter("bname"));
			book.setBookAuthor(req.getParameter("bauthor"));
			book.setBookDescription(req.getParameter("des"));
			System.out.println(bDao.updateBook(cBid,book));
			mv.addObject("Message","Book Updated");
		}
		else
		{
			mv.addObject("Message","Id with "+bid+" Not found in Library");
		}
		return mv;
	}
	
	@GetMapping("/deleteBook")
	public ModelAndView deleteBook(@RequestParam("bid") int bid)
	{
		ModelAndView mv = new ModelAndView("deleteBook.jsp");
		int cBid = bDao.searchBook(bid);
		if(cBid>0)
		{
			if(bDao.deleteBook(cBid)>0);
				mv.addObject("Message","Id with "+bid+" Deleted ");
		}
		else
		{
			mv.addObject("Message","Id with "+bid+" Not found in Library");
		}
		return mv;	
	}
	
	@RequestMapping(value="/viewBooks",method=RequestMethod.GET)
	public ModelAndView viewBooks()
	{
		ModelAndView mv= new ModelAndView("viewBooks.jsp");
		List<Book> books = bDao.getBooks();
		mv.addObject("books",books);
		return mv;
	}
	
}
