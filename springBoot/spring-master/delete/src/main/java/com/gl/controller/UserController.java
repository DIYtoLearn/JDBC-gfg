package com.gl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.beans.User;
import com.gl.repo.UserDao;

@Controller
public class UserController
{
	@Autowired
	private UserDao uDao;
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("username") String username,@RequestParam("pass") String pass,HttpServletRequest req,HttpServletResponse res)
	{
			
		User user = new User();
		user.setUserName(username);
		user.setUserpassword(pass);
		int uid=uDao.checkuser(user);
		if(uid>0)
		{
			HttpSession hp=req.getSession();
			ModelAndView mv = new ModelAndView("dashboard.jsp");
			mv.addObject("user",username);
			return mv;	
		}
		else
		{
			ModelAndView lg = new ModelAndView("index.jsp");
			lg.addObject("msg", "Invalid Credentials");
			return lg;
		}
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("username") String username,@RequestParam("pass") String pass,@RequestParam("uemail") String email)
	{
		User user = new User();
		user.setUserName(username);
		user.setUserpassword(pass);
		user.setEmail(email);
		
		int rowAffected = uDao.saveUser(user);
		ModelAndView mv = new ModelAndView("index.jsp");
		if(rowAffected>0)
		{
			mv.addObject("msg","User registered successfully");
		}
		else
		{
			mv.addObject("msg","Error occured while Registration user not added");
		}
		
		return mv;	
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView dashBoard()
	{
		return  new ModelAndView("jsp/dashboard.jsp");	
	}
	
	@RequestMapping(value="/addBookPage",method=RequestMethod.GET)
	public ModelAndView addBookpage()
	{
		return new ModelAndView("addBookForm.jsp");
	}
	
	@RequestMapping(value="/updateBookPage",method=RequestMethod.GET)
	public ModelAndView updateBookpage()
	{
		return new ModelAndView("updateBookForm.jsp");
	}
	
	@RequestMapping(value="/deleteBookPage",method=RequestMethod.GET)
	public ModelAndView deleteBookpage()
	{
		return new ModelAndView("deleteBook.jsp");
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest req)
	{
		req.getSession().invalidate();
		
		return new ModelAndView("redirect:/index.jsp");
	}
	
}
