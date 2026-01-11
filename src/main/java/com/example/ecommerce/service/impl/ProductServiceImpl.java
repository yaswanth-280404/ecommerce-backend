package com.example.ecommerce.service.impl;

import java.util.List;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	

	public ProductServiceImpl(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}
	
	@Override
	public Product createProduct(Product product, Long categoryId) {
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() ->
				new RuntimeException("Category Not Found"));
		product.setCategory(category);
		return productRepository.save(product);
	}


	@Override
	public List<Product> getProductsByCategory(Long categoryid) {
		return productRepository.findBycategoryId(categoryid);
	}

	

}
