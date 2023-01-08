package com.anudip.jpa.service;

import java.util.List;
import com.anudip.jpa.entity.User;

public interface UserService {
	
	//Abstract Methods For different CRUD Operations
	 public User saveUser(User user);
	 
	 public User getUserById(int id);
	 
	 public User updateUserData(User user, int id);
	 
	 public void deleteUserById(int id);
	 
	 public List<User> getAllUsers();
	 
	 public List<User> getUserByName(String name);
	 
	 public List<User> getUserByAddress(String address);

}
