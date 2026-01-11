package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.User;

public interface UserService {
	
	User createUser(User user);
	
	User getUserById(Long id);
	
	List<User> getAllUsers();
	
}
