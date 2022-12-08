package com.anudip.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "BookData")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "Please Enter Book Name")
	private String bookName;
	
	@Column(length = 50 , nullable = false)
	@NotBlank(message = "Please Enter Author Name")
	private String authorName;
	
	@Column(length = 50 , nullable = false)
	@NotBlank(message = "Please Enter Publisher Name")
	private String publisherName;
	
	@Column(length = 10 , nullable = false)
	@NotBlank(message = "Please Enter Book Published Year")
	private String publishedYear;
	
	@Column(length = 10 , nullable = false)
	@NotNull(message = "Please Enter Book Price")
	private double bookPrice;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	

}
