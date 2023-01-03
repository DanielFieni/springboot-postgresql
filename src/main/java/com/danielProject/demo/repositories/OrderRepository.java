package com.danielProject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielProject.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
