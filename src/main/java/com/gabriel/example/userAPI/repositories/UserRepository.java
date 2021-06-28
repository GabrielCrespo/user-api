package com.gabriel.example.userAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.example.userAPI.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
