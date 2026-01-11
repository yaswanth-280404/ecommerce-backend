package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findBycategoryId(Long categoryId);
	
	List<Product> findBypriceBetween(double min, double max);

}
