package com.enosh.CouponSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enosh.CouponSystem.entity.Category;
import com.enosh.CouponSystem.entity.CategoryName;
import com.enosh.CouponSystem.repository.CategoryRepository;

@Component
public class CategoryDao {

	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryDao(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public Optional<Category> findByName(CategoryName name) {
		return categoryRepository.findByName(name);
	}
	
	public Category createOrGetByName(Category category) {
		Optional<Category> byName = findByName(category.getName());
		if (byName.isPresent()) {
			return byName.get();
		}
		return categoryRepository.save(category);
	}
	
}
