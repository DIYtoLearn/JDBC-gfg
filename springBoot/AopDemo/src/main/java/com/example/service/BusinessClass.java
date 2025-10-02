package com.example.service;

import org.springframework.stereotype.Service;

import com.example.annos.MyAnnotation;


@Service
public class BusinessClass 
{
	@MyAnnotation
	public void bookTicket()
	{
		System.out.println("Booking ticket started");
		throw new RuntimeException();
		//System.out.println("Ticket booked with id 11234");
	}

}
