package com.reg.service;


import com.reg.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public String checkEmail(String email);
	
	public String checkPass(String pass);
}
