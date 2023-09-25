package com.queries_springboot.basic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.queries_springboot.basic.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	public List<Book> findByOrderByName();
	
	
	public List<Book> findByOrderByAuthorAscPublicationDateDesc();
}
