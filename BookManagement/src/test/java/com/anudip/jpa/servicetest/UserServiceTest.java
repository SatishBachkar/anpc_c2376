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
import com.anudip.jpa.entity.User;
import com.anudip.jpa.repository.UserRepository;
import com.anudip.jpa.service.UserService;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService uService;
	
	@MockBean
	private UserRepository uRepo;
	
	// (1)testcase for saveUser() for userService
	@Test
	public void testSaveUser() {
		User u = new User();
		u.setUserId(1);
		u.setUserName("Satish");
		u.setAddress("Rahuri");
		u.setEmail("satish@gmail.com");
	    u.setPhoneNumber((long) 911940464);
	    Mockito.when(uRepo.save(u)).thenReturn(u);
		assertThat(uService.saveUser(u)).isEqualTo(u);

	}
	
	// (2)testcase for getAllUsers() for userService
	@Test
	public void testAllUsers() {
		User u = new User();
		u.setUserId(1);
		u.setUserName("Satish");
		u.setAddress("Rahuri");
		u.setEmail("satish@gmail.com");
	    u.setPhoneNumber((long) 911940464);
	    
	    User u1 = new User();
		u.setUserId(2);
		u.setUserName("Dhananjay");
		u.setAddress("rampur");
		u.setEmail("dhananjay@gmail.com");
	    u.setPhoneNumber((long) 982213457);
	    
	    User u2 = new User();
		u.setUserId(3);
		u.setUserName("Shweta");
		u.setAddress("beed");
		u.setEmail("shweta@gmail.com");
	    u.setPhoneNumber((long) 906711066);
	    
	    List<User> list = new ArrayList<User>();
	    list.add(u);
	    list.add(u1);
	    list.add(u2);
	    
	    Mockito.when(uRepo.findAll()).thenReturn(list);
	    assertThat(uService.getAllUsers()).isEqualTo(list);
	}
	
	// (3)testcase for getUserById() for userService
		@Test
		public void testgetUseById() {
			User u = new User();
			u.setUserId(1);
			u.setUserName("Satish");
			u.setAddress("Rahuri");
			u.setEmail("satish@gmail.com");
		    u.setPhoneNumber((long) 98555884);
			
			Optional<User> a = Optional.of(u);
			User ua = a.get();
			
			Mockito.when(uRepo.findById(1)).thenReturn(a);
			assertThat(uService.getUserById(1)).isEqualTo(ua);
			
		}
		
		//(4)testcase for updateUserData() for userService
		@Test
		public void testUpdateUserById() {
			User u = new User();
			u.setUserId(1);
			u.setUserName("Satish");
			u.setAddress("Rahuri");
			u.setEmail("satish@gmail.com");
		    u.setPhoneNumber((long) 95426874);
			
			Optional<User> a = Optional.of(u);
			User u1 = a.get();
			
			Mockito.when(uRepo.findById(1)).thenReturn(a);
			
			//updated phone 
			u1.setPhoneNumber((long) 911940464);
			Mockito.when(uRepo.save(u1)).thenReturn(u1);
			assertThat(uService.updateUserData(u1, 1)).isEqualTo(u1);
		}

		
		//(5)testing deleteUserById() of user service
		
		@Test
		public void testDeleteUserById() {
			User u = new User();
			u.setUserId(1);
			u.setUserName("Satish");
			u.setAddress("Rahuri");
			u.setEmail("satish@gmail.com");
		    u.setPhoneNumber((long) 95426874);
			
			Optional<User> op=Optional.of(u);
			
			Mockito.when(uRepo.existsById(1)).thenReturn(false);
			assertThat(uRepo.existsById(op.get().getUserId()));
		
		}

		// testing getUserByName() of user service
		@Test
		public void testGetUserByName() {
			User u1= new User();
			u1.setUserId(1);
			u1.setUserName("Satish");
			u1.setAddress("Rahuri");
			u1.setEmail("satish@gmail.com");
		    u1.setPhoneNumber((long) 911940464);
		    
		    User u2 = new User();
			u2.setUserId(2);
			u2.setUserName("Dhananjay");
			u2.setAddress("rampur");
			u2.setEmail("dhananjay@gmail.com");
		    u2.setPhoneNumber((long) 982213457);
			
			
		List<User> li=new ArrayList<>();
		
		li.add(u1);
		li.add(u2);
		
		Mockito.when(uRepo.getUserByName("Dhananjay")).thenReturn(li);
		assertThat(uService.getUserByName("Dhananjay")).isEqualTo(li);
		
		}

		
		//(6)testing getUserByAddress() of user service 
		@Test
		public void testGetUserByAddress() {
			User u1= new User();
			u1.setUserId(1);
			u1.setUserName("Satish");
			u1.setAddress("Rahuri");
			u1.setEmail("satish@gmail.com");
		    u1.setPhoneNumber((long) 911940464);
		
			List<User> li=new ArrayList<>();
			li.add(u1);
			
			Mockito.when(uRepo.getUserByAddress("Rahuri")).thenReturn(li);
			assertThat(uService.getUserByAddress("Rahuri")).isEqualTo(li);
		}



}
