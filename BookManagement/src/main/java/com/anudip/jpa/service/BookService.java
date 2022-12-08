package com.anudip.jpa.service;

import java.util.List;

import com.anudip.jpa.entity.Book;

public interface BookService {
	
	
	public Book saveBook(Book book);
	
	public Book getBookById(int id);
	
	public List<Book> getBookData();
	
	public Book updateBookById(Book book1, int id);
	
	public void deleteById(int id);

}
