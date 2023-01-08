package com.anudip.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anudip.jpa.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	//fetching book data by BookName from database
	@Query("select b from Book b where b.bookName=?1")
	List<Book> getBookByName(String pName);
	
	//fetching book data by BookCategory from database
	@Query("select b from Book b where b.bookCategory=?1")
	List<Book> getBookByCategory(String category);
	
	//fetching book data by Author name from database
	@Query("select b from Book b where b.authorName=?1")
	List<Book> getBookByAuthorName(String author);
}
