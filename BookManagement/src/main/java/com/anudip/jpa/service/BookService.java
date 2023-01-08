package com.anudip.jpa.service;

import java.util.List;
import com.anudip.jpa.entity.Book;

public interface BookService {
	
	//Abstract Methods For different CRUD Operations
	public Book saveBook(Book book);
	
	public Book getBookById(int id);
	
	public List<Book> getAllBook();
	
	public Book updateBookById(Book book1, int id);
	
	public void deleteBookById(int id);
	
	public List<Book> getBookByName(String pName);
	
	public List<Book> getBookByCategory(String category);
	
	public List<Book> getBookByAuthorName(String author);

}
