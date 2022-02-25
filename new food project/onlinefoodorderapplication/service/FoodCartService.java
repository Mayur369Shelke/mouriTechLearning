package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;

public interface FoodCartService {
	
	FoodCart insertCart(FoodCart newCart);
	FoodCart showCartById(String cartId) ;
	List<FoodCart> showAllCarts();
	FoodCart updateCartById(String cartId, FoodCart cart) ;
	void deleteCartById(String cartId) ;
	ResponseEntity<List<FoodCart>> getAllCartsByprodId(long itemId); //throws ItemNotFoundException;
Items addItems(Long restaurantId, Items item);
ResponseEntity<List<FoodCart>> getAllCartsByItemId(Long ItemId);
ResponseEntity<FoodCart> createCart(Long itemId, FoodCart newCart);

}
