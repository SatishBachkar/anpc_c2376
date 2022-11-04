package hibernate.crude.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CustomerDetails")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Customer Name Cannot Be Blank")
	private String name;
	
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Customer Address Cannot Be Blank")
	private String address;
	
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Customer Email Cannot Be Blank")
	private String email;
	
	
	@Column(length = 11,nullable = false)
	@NotBlank(message = "Customer Contact Number Cannot Be Blank")
	private Long phone;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	
}
