package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;

public interface FoodCartService {
	
	FoodCart insertCart(FoodCart newCart);
	List<FoodCart> showAllCarts();
	FoodCart updateCartById(Long cartId, FoodCart cart) throws ResourceNotFoundException ;
FoodCart showCartById(Long cartId) throws ResourceNotFoundException;
void deleteCartById(long cartId) throws ResourceNotFoundException;

}
