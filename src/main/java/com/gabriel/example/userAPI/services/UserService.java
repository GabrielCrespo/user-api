package com.gabriel.example.userAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.example.userAPI.domain.User;
import com.gabriel.example.userAPI.repositories.UserRepository;
import com.gabriel.example.userAPI.services.exceptions.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findUserById(Integer id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new UserNotFoundException("User with id " + id + " was not found!"));
	}

	public List<User> listAllUsers() {
		return repository.findAll();
	}

	public User updateUserById(Integer id, User user) {
		User updatedUser = findUserById(id);

		updatedUser.setName(user.getName());
		updatedUser.setLogin(user.getLogin());
		updatedUser.setPassword(user.getPassword());

		return repository.save(updatedUser);
	}

}
