package com.mouritech.springboothibernetdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springboothibernetdemo.entity.Product;
import com.mouritech.springboothibernetdemo.service.ProductService;

@RestController
@RequestMapping("product/api/v1")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public Product insertProduct(@RequestBody Product product) {
		
		return productService.insertProduct(product);
	}
	

}
