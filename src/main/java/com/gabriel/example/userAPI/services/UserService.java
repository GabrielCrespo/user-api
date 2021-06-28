package com.gabriel.example.userAPI.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.example.userAPI.domain.User;
import com.gabriel.example.userAPI.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User findUserById(Integer id) {
		Optional<User> user = repository.findById(id);
		return user.orElse(null);
	}
	
}
