package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	private final ProductService productService;
	
	@PostMapping("/category/{categoryId}")
	public Product createProduct(@RequestBody Product product, @PathVariable Long categoryId) {
		return productService.createProduct(product, categoryId);
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getProductByCategory(@PathVariable Long categoryId){
		return productService.getProductsByCategory(categoryId);
	}
	
}
