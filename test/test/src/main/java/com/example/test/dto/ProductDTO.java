package com.example.test.dto;

import lombok.Data;
import com.example.test.dto.CategoryDTO;

@Data
public class ProductDTO 
{
	private Long id;
    private String name;
    private double price;
    private CategoryDTO category;
}
