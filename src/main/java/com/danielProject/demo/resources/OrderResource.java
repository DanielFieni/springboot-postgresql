package com.danielProject.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielProject.demo.entities.Order;
import com.danielProject.demo.services.OrderService;

// Identify that the web resource is implemented by a rest controller
@RestController
// Define a name for the resource
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	// ResponseEntity - Return responses from web requests
	// Identify that the method responds to a GET/HTTP type request
	@GetMapping
	public ResponseEntity<List<Order>> findAll()
	{
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id)
	{
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
