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

	//Saving Book Data By Using save();
	public Book saveBook(Book book) {
		return bRepo.save(book);
	}

	//Fetching Book Data By Id Using findById();
	public Book getBookById(int id) {
		return bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
	}

	//Fetching All Book Data By Using findAll();
	@Override
	public List<Book> getAllBook() {
		return bRepo.findAll();
	}

	//Updating Book Data By Id Using set();
	@Override
	public Book updateBookById(Book book1, int id) {
		 Book book2 = bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
		
		 book2.setDateOfBookGiven(book1.getDateOfBookGiven());
		 book2.setDateOfBookReturn(book1.getDateOfBookReturn());
		 bRepo.save(book2);
		 return book2;
	}

	//Deleting Book Data By Id Using deleteById();
	@Override
	public void deleteBookById(int id) {
		bRepo.findById(id).orElseThrow(()-> new BookNotFoundException("Book Not Found"));
		bRepo.deleteById(id);
		
	}
	
	//Fetching Book Data By Using getBookByName() calling from bookRepository;
	 @Override 
	 public List<Book> getBookByName(String pName) { 
		 return bRepo.getBookByName(pName); }

	//Fetching Book Data By Using getBookByCategory() calling from bookRepository;
	@Override
	public List<Book> getBookByCategory(String category) {
		return bRepo.getBookByCategory(category);
	}

	//Fetching Book Data By Using getBookByAuthorName() calling from bookRepository;
	@Override
	public List<Book> getBookByAuthorName(String author) {
		return bRepo.getBookByAuthorName(author);
	}

	

	
	 
	 

}
