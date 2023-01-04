package com.danielProject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielProject.demo.entities.OrderItem;
import com.danielProject.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
	
}
