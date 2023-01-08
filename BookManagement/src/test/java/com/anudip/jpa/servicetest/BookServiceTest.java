package com.anudip.jpa.servicetest;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.anudip.jpa.entity.Book;
import com.anudip.jpa.repository.BookRepository;
import com.anudip.jpa.service.BookService;

@SpringBootTest
public class BookServiceTest {

	@Autowired
	private BookService bService;
	
	@MockBean
	private BookRepository bRepo;
	
	//(1) testcase for saveBook() for userService
	@Test
	public void testSaveBook() {
		Book b = new Book();
		b.setBookId(1);
		b.setBookName("Good thoughts");
		b.setBookCategory("Motivation");
		b.setAuthorName("Tony stark");
		b.setPublisherName("usa publisher");
		b.setPublishedYear("1990");
		b.setDateOfBookGiven("24/12/2022");
		b.setDateOfBookReturn("01/01/2022");
		
	    Mockito.when(bRepo.save(b)).thenReturn(b);
		assertThat(bService.saveBook(b)).isEqualTo(b);

	}
	
	
	//(2) testing getBookById) of book service
	@Test
	public void testGetBookById() {
		Book b1=new Book();
		b1.setBookId(1);
		b1.setBookName("Wings Of Fire");
		b1.setBookCategory("Inspirational");
		b1.setAuthorName("Dr A.P.J. Kalam");
		b1.setPublishedYear("1999");
		b1.setDateOfBookGiven("27-12-2022");
		b1.setDateOfBookReturn("01-01-2023");
		
		Optional<Book> b=Optional.of(b1);
		Book ub=b.get();
		
		Mockito.when(bRepo.findById(1)).thenReturn(b);
		assertThat(bService.getBookById(1)).isEqualTo(ub);
	}
	
	//(3) testing updateBookById() of book service
	@Test
	public void testUpdateBookById() {
		Book b1=new Book();
		b1.setBookId(1);
		b1.setBookName("Wings Of Fire");
		b1.setBookCategory("Inspirational");
		b1.setAuthorName("Dr A.P.J. Kalam");
		b1.setPublishedYear("1999");
		b1.setDateOfBookGiven("27-12-2022");
		b1.setDateOfBookReturn("01-01-2023");
		
		Optional<Book> b=Optional.of(b1);
		Book ub=b.get();
		
		Mockito.when(bRepo.findById(1)).thenReturn(b);
		
		//update
		ub.setDateOfBookGiven("30-12-2022");
		ub.setDateOfBookReturn("15-01-2023");
		
		Mockito.when(bRepo.save(ub)).thenReturn(ub);
		assertThat(bService.updateBookById(ub, 1)).isEqualTo(ub);
		
	}
	
	  // (4) testing getAllBook() of book service
	
		@Test
		public void testGetAllBook() {
			Book b1=new Book();
			b1.setBookId(1);
			b1.setBookName("Wings Of Fire");
			b1.setBookCategory("Inspirational");
			b1.setAuthorName("Dr A.P.J. Kalam");
			b1.setPublishedYear("1999");
			b1.setDateOfBookGiven("27-12-2022");
			b1.setDateOfBookReturn("01-01-2023");
		
			Book b2=new Book();
			b2.setBookId(2);
			b2.setBookName("Sambhaji");
			b2.setBookCategory("Historical");
			b2.setAuthorName("v patil");
			b2.setPublishedYear("1989");
			b2.setDateOfBookGiven("27-12-2022");
			b2.setDateOfBookReturn("01-01-2023");
		
			List<Book> li=new ArrayList<>();
			li.add(b1);
			li.add(b2);
			
			Mockito.when(bRepo.findAll()).thenReturn(li);
			assertThat(bService.getAllBook()).isEqualTo(li);
		}

		//(5) testing deleteBookById() of Book service
		
		@Test
		public void testDeleteBookById() {
			Book b1=new Book();
			b1.setBookId(1);
			b1.setBookName("Wings Of Fire");
			b1.setBookCategory("Inspirational");
			b1.setAuthorName("Dr A.P.J. Kalam");
			b1.setPublishedYear("1999");
			b1.setDateOfBookGiven("27-12-2022");
			b1.setDateOfBookReturn("01-01-2023");
		
			Optional<Book> b=Optional.of(b1);
			
			
			Mockito.when(bRepo.existsById(1)).thenReturn(false);
			assertThat(bRepo.existsById(b.get().getBookId()));
			}
		
		//(6) testing getBookByCategory() of book service
		@Test
		public void testGetBookByCategory() {
			Book b1=new Book();
			b1.setBookId(1);
			b1.setBookName("Wings Of Fire");
			b1.setBookCategory("Inspirational");
			b1.setAuthorName("Dr A.P.J. Kalam");
			b1.setPublishedYear("1999");
			b1.setDateOfBookGiven("27-12-2022");
			b1.setDateOfBookReturn("01-01-2023");
		
			List<Book> li=new ArrayList<>();
			li.add(b1);
			
			
			Mockito.when(bRepo.getBookByCategory("Inspirational")).thenReturn(li);
			assertThat(bService.getBookByCategory("Inspirational")).isEqualTo(li);
			}
			
		//(7) testing getBookByauthorName () of Book Service
		@Test
		public void testGetBookByAuthorName() {
			Book b1=new Book();
			b1.setBookId(1);
			b1.setBookName("Wings Of Fire");
			b1.setBookCategory("Inspirational");
			b1.setAuthorName("Dr A.P.J. Kalam");
			b1.setPublishedYear("1999");
			b1.setDateOfBookGiven("27-12-2022");
			b1.setDateOfBookReturn("01-01-2023");
		
			List<Book> li=new ArrayList<>();
			li.add(b1);
			
			
			Mockito.when(bRepo.getBookByAuthorName("Dr A.P.J. Kalam")).thenReturn(li);
			assertThat(bService.getBookByAuthorName("Dr A.P.J. Kalam")).isEqualTo(li);
		}




	
}
