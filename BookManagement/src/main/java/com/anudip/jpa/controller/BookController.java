package com.anudip.jpa.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.anudip.jpa.entity.Book;
import com.anudip.jpa.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	private BookService bs;
	
	//PostMapping for save book data
	@PostMapping("/saveB")
	public ResponseEntity<Book> saveB(@Valid @RequestBody Book book){
		return new ResponseEntity<Book>(bs.saveBook(book), HttpStatus.CREATED);
	}
	//GetMapping for get book data by id
	@GetMapping("/getB/{id}")
	public ResponseEntity<Book> getB(@PathVariable("id")@RequestBody int id){
		return new ResponseEntity<Book>(bs.getBookById(id),HttpStatus.OK);
	}
	
	//PutMapping for update book data by id
	@PutMapping("/updateB/{id}")
	public ResponseEntity<Book> updateB(@RequestBody Book book, @PathVariable("id") int id){
		return new ResponseEntity<Book>(bs.updateBookById(book, id),HttpStatus.OK);
	}
	
	//DeleteMapping for delete book data by id
	@DeleteMapping("/deleteB/{id}")
	public ResponseEntity<String> deleteB(@RequestBody @PathVariable("id") int id ){
	   bs.deleteBookById(id);
	    return new ResponseEntity<String>("Book Deleted Successfully", HttpStatus.OK);
	
	}
	
	//GetMapping for get book data by id
	@GetMapping("/getAllB")	
	public List<Book> getAllB(){
		return bs.getAllBook();
	}
	
	//fetching Book data by bname using get mapping
	@GetMapping("/getBookByName/{bname}")
	public List<Book> getBookByName(@PathVariable("bname") String bname){
	return bs.getBookByName(bname);
	}
	
	//fetching Book data by category using get mapping
	@GetMapping("/getBookByCategory/{category}")
	public List<Book> getBookByCategory(@PathVariable("category") String category){
	return bs.getBookByCategory(category);
	}
	
	//fetching Book data by category using get mapping
		@GetMapping("/getBookByAuthor/{author}")
		public List<Book> getBookByAuthorName(@PathVariable("author") String author){
		return bs.getBookByAuthorName(author);
		}
	


}
