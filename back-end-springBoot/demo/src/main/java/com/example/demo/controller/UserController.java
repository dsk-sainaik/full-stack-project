package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.servise.UserServise;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {
	@Autowired
	private UserServise servise;
	
	@PostMapping("/insert")
	public User insertUser(@RequestBody User user)
	{
		return servise.insertUser(user);
	}
	
	@GetMapping("/allUser")
	public List<User> getAllUser()
	{
		return servise.getUsers();
	}

}
