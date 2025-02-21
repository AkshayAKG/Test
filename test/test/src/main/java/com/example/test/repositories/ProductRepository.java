package com.example.test.repositories;

import com.example.test.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepository extends JpaRepository<Product, Long>{
	 Page<Product> findAll(Pageable pageable);
}
