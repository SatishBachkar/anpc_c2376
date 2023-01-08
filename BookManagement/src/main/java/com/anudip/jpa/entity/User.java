package com.anudip.jpa.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Second Entity
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_Data")
public class User {
	
	@Id
	private int userId;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Please Enter User Name")
	private String userName;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "Please Enter email")
	private String email;
	
	
	@NotNull(message = "Please Enter phone number ")
	private Long phoneNumber;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "Please Enter Address")
	private String address;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Book> bookList;
}
