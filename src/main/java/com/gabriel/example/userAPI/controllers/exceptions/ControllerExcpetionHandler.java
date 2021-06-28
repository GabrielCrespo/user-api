package com.gabriel.example.userAPI.controllers.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gabriel.example.userAPI.services.exceptions.UserNotFoundException;

@ControllerAdvice
public class ControllerExcpetionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<StandardError> userNotFound(UserNotFoundException e, HttpServletRequest request) {
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), System.currentTimeMillis(),
				e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}
