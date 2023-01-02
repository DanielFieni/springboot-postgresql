package com.danielProject.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielProject.demo.entities.User;

// Identify that the web resource is implemented by a rest controller
@RestController
// Define a name for the resource
@RequestMapping(value = "/users")
public class UserResource {
	
	// ResponseEntity - Return responses from web requests
	// Identify that the method responds to a GET/HTTP type request
	@GetMapping
	public ResponseEntity<User> findAll()
	{
		User u = new User(1, "Maria", "maria@gmail.com", "11111", "2222222");
		return ResponseEntity.ok().body(u);
	}

}
