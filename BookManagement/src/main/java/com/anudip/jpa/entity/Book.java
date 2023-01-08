package com.anudip.jpa.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//first Entity
@Entity
@Table(name = "BookData")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "Please Enter Book Name")
	private String bookName;
	
	@Column(length = 10 , nullable = false)
	@NotNull(message = "Please Enter Book Price")
	private String bookCategory;
	
	@Column(length = 50 , nullable = false)
	@NotBlank(message = "Please Enter Author Name")
	private String authorName;
	
	@Column(length = 50 , nullable = false)
	@NotBlank(message = "Please Enter Publisher Name")
	private String publisherName;
	
	@Column(length = 10 , nullable = false)
	@NotBlank(message = "Please Enter Book Published Year")
	private String publishedYear;
	
	@Column(length = 12, nullable = false)
	@NotEmpty(message = "Please Enter date of given ")
	private String dateOfBookGiven;
	
	@Column(length = 12, nullable = false)
	@NotEmpty(message = "Please Enter date of return ")
	private String dateOfBookReturn;
	
	//manyToOne mappping user id column acting as a foreign key
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="User_Id", referencedColumnName ="userId")
	@JsonBackReference
	private User user;
	
	

	
}
