package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Category;


public interface CategoryService {
	
	Category createCategory(Category category);
	
	List<Category> getAllCategories();

}
