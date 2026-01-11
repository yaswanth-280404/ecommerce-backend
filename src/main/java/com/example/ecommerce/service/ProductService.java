package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Product;

public interface ProductService {
	
	Product createProduct(Product product, Long categoryId);
	
	List<Product> getProductsByCategory(Long categoryid);

}
