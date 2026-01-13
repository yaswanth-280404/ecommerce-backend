package com.example.ecommerce.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce.exception.DuplicateResourceException;
import com.example.ecommerce.model.Category;
import com.example.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	private final CategoryRepository categoryRepository;
	

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category createCategory(Category category) {
		if (categoryRepository.existsByName(category.getName())) {
			throw new DuplicateResourceException("Category Already Exists !!");
		}
		
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
}
