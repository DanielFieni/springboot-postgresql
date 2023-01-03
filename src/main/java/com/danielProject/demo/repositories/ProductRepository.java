package com.danielProject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielProject.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
