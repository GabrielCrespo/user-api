package com.gabriel.example.userAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.example.userAPI.domain.User;
import com.gabriel.example.userAPI.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable Integer id){
		User user = service.findUserById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> listAllUsers(){
		List<User> users = service.listAllUsers();
		return ResponseEntity.ok().body(users);
	}
	
}
