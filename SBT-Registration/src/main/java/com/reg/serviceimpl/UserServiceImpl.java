package com.reg.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.entity.User;
import com.reg.repository.UserRepository;
import com.reg.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository repo;
	
	@Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public String checkEmail(String email) {
		return repo.checkEmail(email);
	}

	@Override
	public String checkPass(String pass) {
	return repo.checkPass(pass);
	}

}
