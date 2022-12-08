package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.Book;
import com.anudip.jpa.repository.BookRepository;
import com.anudip.jpa.service.BookService;
import com.anudip.jpa.exception.BookNotFoundException;


@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bRepo;

	
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bRepo.save(book);
	}

	
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
	}

	@Override
	public List<Book> getBookData() {
		// TODO Auto-generated method stub
		return bRepo.findAll();
	}

	@Override
	public Book updateBookById(Book book1, int id) {
		// TODO Auto-generated method stub
		 bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
		 Book book2 = new Book();
		 book2.setBookPrice(book1.getBookPrice());
		 return book2;
	}

	@Override
	public void deleteById(int id) {
		bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
		bRepo.deleteById(id);
		
		
	}

}
