package com.mouritech.springboothibernetdemo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springboothibernetdemo.entity.Product;
import com.mouritech.springboothibernetdemo.repository.ProductRepository;

@Service
public class ProductServiceIMpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product insertProduct(Product theNewproduct) {
		theNewproduct.setProductId(generateProductId());
		return productRepository.save(theNewproduct);
		
	}
	
	public long generateProductId() {
		 Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-255
	      Long  int_random = (long) rand.nextInt(upperbound); 
	      return int_random;
	     
	}

}
