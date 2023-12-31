package com.queries_springboot.basic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queries_springboot.basic.entities.Book;
import com.queries_springboot.basic.repositories.BookRepository;

@RestController
@RequestMapping(value ="/books")
public class BookResource {
	
	@Autowired
	private BookRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		List<Book> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value="/sortByName")
	public ResponseEntity<List<Book>> findOrderByName(){
		List<Book> result = repository.findByOrderByName();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value="/sortByAuthorAndDate")
	public ResponseEntity<List<Book>> findOrderByAuthorAndDate(){
		List<Book> result = repository.findByOrderByAuthorAscPublicationDateDesc();
		return ResponseEntity.ok(result);
	}

}
