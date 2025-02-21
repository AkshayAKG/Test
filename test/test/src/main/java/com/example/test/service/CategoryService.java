package com.example.test.service;


import com.example.test.Category;
import com.example.test.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
	
	  @Autowired
	    private CategoryRepository categoryRepository;

	    public Page<Category> getAllCategories(Pageable pageable) {
	        return categoryRepository.findAll(pageable);
	    }

	    public Optional<Category> getCategoryById(Long id) {
	        return categoryRepository.findById(id);
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Long id, Category category) {
	        category.setId(id);
	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }

}
