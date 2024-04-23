package com.example.demo.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServise {
	@Autowired
	private UserRepo repo;
	
	
	public User insertUser(User user)
	{
		return repo.save(user);
	}
	
	public List<User> getUsers() {
		return repo.findAll();
		
	}

}
