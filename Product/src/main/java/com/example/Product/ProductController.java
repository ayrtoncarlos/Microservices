package com.example.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@GetMapping("/products/{id}/")
	public Product getProduct(@PathVariable int id) 
	{
		Product product = new Product();
		
		product.setId(id);
		product.setName("CD");
		product.setValue(6.66);
		
		return product;
	}
}
