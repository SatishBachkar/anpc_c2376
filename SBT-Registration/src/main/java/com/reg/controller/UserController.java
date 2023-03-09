package com.reg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.reg.entity.User;
import com.reg.service.UserService;

@Controller
public class UserController {

	@Autowired
	public UserService service;
	
//	Default mapping for pages    *****************************************************
	@GetMapping("/")
	public String login() {
		return "login";
}
	@GetMapping("/regi")
	public String register() {
		return "register";
}

	
	// for register Employee    *******************************************************
	
	@PostMapping("/register")
	public String register(@ModelAttribute User user) {
		 service.addUser(user);
		 return "register";
	}
	
	// for login Employee
	@PostMapping("login")
	public String login(@ModelAttribute User user) {
		String username=user.getEmail();
		String userpass=user.getPassword();
		
		String mail=service.checkEmail(user.getEmail());
		String pass=service.checkPass(user.getPassword());
		
		
		if(mail==username && pass==userpass) {
			//System.out.println("Registerd Successfully");
			return "register";
		}else {
			//System.out.println("Enterd valied imformation");
		}
		
		return "login";
		
	}
	
	

	
		
}
