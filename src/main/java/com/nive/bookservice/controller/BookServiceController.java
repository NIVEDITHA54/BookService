package com.nive.bookservice.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.nive.bookservice.model.Book;
import com.nive.bookservice.repository.BookRepository;


@Controller
@RequestMapping("/bookservice")
public class BookServiceController {
	
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> retrieveAllBooks(){
		
		List<Book> books = (List<Book>) bookRepository.findAll();
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
		
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> retrieveBook(@PathVariable("id") Long id){
		Book book=bookRepository.findById(id).orElseGet(Book::new);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	@PostMapping("/books")
	public ResponseEntity<Object> createBook(@RequestBody Book book){
		Book savedbook = bookRepository.save(book);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedbook.getId()).toUri();

		return ResponseEntity.created(location).build();
		
	}
	
	@PutMapping("books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") long id, @RequestBody Book book){
		
		Optional<Book> bookOptional = bookRepository.findById(id);

		if (!bookOptional.isPresent())
			return ResponseEntity.notFound().build();

		book.setId(id);
		
		bookRepository.save(book);

		return ResponseEntity.noContent().build();	}
	
	@DeleteMapping("books/{id}")
	public void deleteBook(@PathVariable("id") long id){
		bookRepository.deleteById(id);
}
}
