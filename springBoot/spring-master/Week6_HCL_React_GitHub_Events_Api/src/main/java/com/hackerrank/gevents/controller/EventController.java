package com.hackerrank.gevents.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.gevents.model.Event;
import com.hackerrank.gevents.repository.EventsRepository;
//creating RestController
@RestController
public class EventController 
{
	//autowired the EventsRepositiry class
	@Autowired
	EventsRepository eventsRepositiry;
	//creating a get mapping that retrieves all the events detail from the database 
	@GetMapping("/events")
	private ResponseEntity<List<Event>> getAllEvents() 
	{
		return null;
	}
	//creating a get mapping that retrieves the detail of a specific events
	@GetMapping("/events/{eventId}")
	private ResponseEntity<Event> getEvent(@PathVariable("eventId") int eventId) 
	{
		return null;
	}
	
	@GetMapping("/repos/{eventId}/events")
	private ResponseEntity<Event> getEventByRepos(@PathVariable("eventId") int eventId) 
	{
		return null;
	}

	//creating post mapping that post the events detail in the database
	@PostMapping("/events")
	private ResponseEntity<Event> saveEvent(@RequestBody Event events) 
	{
		return null;
	}
}
