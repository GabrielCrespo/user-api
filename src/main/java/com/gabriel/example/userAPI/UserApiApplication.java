package com.gabriel.example.userAPI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.example.userAPI.domain.User;
import com.gabriel.example.userAPI.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Fred Mercury", "fred.mercury", "Queen123");
		User user2 = new User(null, "Elton John", "elton.john", "Tinydancer123");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}

}
