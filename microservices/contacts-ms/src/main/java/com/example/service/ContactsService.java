package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Contacts;
import com.example.repository.ContactsRepo;

@Service
public class ContactsService 
{

	@Autowired
	ContactsRepo repo;
	
	
	public List<Contacts> getContactByUserId(int userId) {
		return repo.findByUserId(userId);
	}
	
	public Contacts createContact(Contacts contact) {
		return repo.save(contact);
	}
	
	
	
}
