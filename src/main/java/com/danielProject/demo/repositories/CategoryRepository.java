package com.danielProject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielProject.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
