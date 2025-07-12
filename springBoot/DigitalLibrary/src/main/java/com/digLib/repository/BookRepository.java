package com.digLib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digLib.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
