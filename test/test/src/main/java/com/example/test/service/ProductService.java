package com.example.test.service;

import com.example.test.Product;
import com.example.test.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

	  @Autowired
	    private ProductRepository productRepository;

	    public Page<Product> getAllProducts(Pageable pageable) {
	        return productRepository.findAll(pageable);
	    }

	    public Optional<Product> getProductById(Long id) {
	        return productRepository.findById(id);
	    }

	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Product updateProduct(Long id, Product product) {
	        product.setId(id);
	        return productRepository.save(product);
	    }

	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }
	
}
