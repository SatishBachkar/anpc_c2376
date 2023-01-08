package com.anudip.jpa.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.jpa.entity.User;
import com.anudip.jpa.exception.UserNotFoundException;
import com.anudip.jpa.repository.UserRepository;
import com.anudip.jpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository uRepo;
	
	
	//saving user data by saveUser Methode save();
	@Override
	public User saveUser(User user) {
		return uRepo.save(user);
	}

	//fetching user data by passing id as a integer if user not found throw exception
	@Override
	public User getUserById(int id) {
		return uRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User data not found"));
		
	}

	//updating user data by this method 1> find data by user id then it is updated to argument object object 
	// new obj is created for getmethods; then return user object
	@Override
	public User updateUserData(User user, int id) {
		uRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User Data Not Found"));
		User user1 = new User();
		user1.setPhoneNumber(user.getPhoneNumber());
		user1.setEmail(user.getEmail());
		uRepo.save(user1);
		return user1;
	}

	//deleting user data by deleteById();
	@Override
	public void deleteUserById(int id) {
		uRepo.findById(id).orElseThrow(()->new UserNotFoundException("User Data Not Found"));
		uRepo.deleteById(id);
		
	}

	//fetching data by findAll()
	@Override
	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	//fetching data by getUserByName() which return in UserRepo;
	@Override
	public List<User> getUserByName(String name) {
		return uRepo.getUserByName(name);
	}

	//fetching data by getUserByAddress() which return in UserRepo;
	@Override
	public List<User> getUserByAddress(String address) {
		return uRepo.getUserByAddress(address);
	}

}
