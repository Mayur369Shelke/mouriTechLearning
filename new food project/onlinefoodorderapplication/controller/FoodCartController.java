package com.mouritech.onlinefoodorderapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;

@RestController
@RequestMapping("/foodcart")
public class FoodCartController {
	@Autowired
	private FoodCartService cartService;
	
	@PostMapping("Cart")
	public FoodCart insertCart(@RequestBody FoodCart newCart) {
		return cartService.insertCart(newCart);
	}
	@GetMapping("Cart")
	public List<FoodCart> showAllCarts() {
		return cartService.showAllCarts();
	}
	@GetMapping("Cart/{cid}")
	public FoodCart showCartById(@PathVariable("cid") String CartId)  {
		return cartService.showCartById(CartId);
	}
	@PutMapping("Cart/{cid}")
	public FoodCart updateCartById(@PathVariable("cid") String CartId, @RequestBody FoodCart Cart)
			{
		return cartService.updateCartById(CartId, Cart);
	}
	@DeleteMapping("Cart/{cid}")
	public String deleteCartById(@PathVariable("cid") String CartId)  {
		cartService.deleteCartById(CartId);
		return "deleted the Cart";
	}
	@GetMapping("/Carts/{itemid}")
	public ResponseEntity<List<FoodCart>> getAllCartsBySellerId(@PathVariable("itemid") long itemId)
			 {
		return cartService.getAllCartsByprodId(itemId);
	}
	@PostMapping("/Carts/{itemid}/item")
	public ResponseEntity<FoodCart> createCart(@PathVariable("itemid") long itemId, @RequestBody FoodCart newCart)
			 {
		return cartService.createCart(itemId, newCart);
	}
}