package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.document.Users;
import com.example.repository.UserRepository;

@RestController
public class UsersController {
     
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public List<Users> getAll() {
		return userRepository.findAll();
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}
	
}
