package com.anudip.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.jpa.entity.User;
import com.anudip.jpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	
	//PostMapping for saving User Data 
	@PostMapping("/saveUser")
	ResponseEntity<User> saveUser(@RequestBody User user ){
		return new ResponseEntity<User>(uService.saveUser(user), HttpStatus.CREATED);	
	}
	
	//GetMapping for fetching User Data by using id 
	@GetMapping("/getUser/{id}")
	ResponseEntity<User> getUserById(@PathVariable("id") @RequestBody int id){
		return new ResponseEntity<User>(uService.getUserById(id), HttpStatus.OK);
		
	}
	
	//PutMapping for Updating User Data By Id
	@PutMapping("/updateUser/{id}")
	ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") int id){
		return new ResponseEntity<User>(uService.updateUserData(user, id), HttpStatus.OK);
		
	}
	
	//DeleteMapping for Deleting User Data
	@DeleteMapping("/deleteUser/{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") int id ){
		uService.deleteUserById(id);
		return new ResponseEntity<String>("User Deleted SuccessFully",HttpStatus.OK);
		
	}
	
	//GetMapping for fetching All User Data
	@GetMapping("/getAllUsers")	
	public List<User> getAllB(){
		return uService.getAllUsers();
	}
	
	//GetMapping for Fetching User Data By Name
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable("name") String name){
		return uService.getUserByName(name);
		
	}
	
	//GetMapping for fetching User Data By using Address
	@GetMapping("/getUserByAddress/{address}")
	public List<User> getUserByAddress(@PathVariable("address")String address){
		return uService.getUserByAddress(address);
		
	}
	
}
