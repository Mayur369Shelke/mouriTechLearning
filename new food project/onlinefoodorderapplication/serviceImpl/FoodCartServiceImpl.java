package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.repository.FoodCartRepository;
import com.mouritech.onlinefoodorderapplication.repository.ItemsRepository;
import com.mouritech.onlinefoodorderapplication.service.FoodCartService;
@Service
public class FoodCartServiceImpl implements FoodCartService {
	
	@Autowired
	private FoodCartRepository cartRepository;
	@Autowired
	private ItemsRepository itemRepository;
	public FoodCart insertCart(FoodCart newCart) {
		// TODO Auto-generated method stub
		return cartRepository.save(newCart);
	}
	public FoodCart showCartById(Long cartId) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return cartRepository.findById(cartId).orElseThrow(
				() -> new ResourceNotFoundException());
	}
	public List<FoodCart> showAllCarts() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}
	public FoodCart updateCartById(Long cartId, FoodCart cart) throws ResourceNotFoundException  {
		// TODO Auto-generated method stub
		FoodCart existingCart = cartRepository.findById(cartId).orElseThrow(()-> new ResourceNotFoundException());
		existingCart.setItems(cart.getItems());
		cartRepository.save(existingCart);
		return existingCart;
	}
	public void deleteCartById(Long cartId) throws ResourceNotFoundException {
		FoodCart existingCart = cartRepository.findById(cartId).orElseThrow(() -> new ResourceNotFoundException());
						cartRepository.delete(existingCart);
		
	}

	@Override
	public ResponseEntity<List<FoodCart>> getAllCartsByItemId(Long ItemId){
	
		
		List<FoodCart> carts = cartRepository.findByItemId(ItemId);
		return new ResponseEntity<List<FoodCart>>(carts,HttpStatus.OK);
	}
	

	public ResponseEntity<List<FoodCart>> getAllCartsByitemId(long itemId) {
		List<FoodCart> carts = cartRepository.findByItemId(itemId);
		return new ResponseEntity<List<FoodCart>>(carts,HttpStatus.OK);
	}
	@Override
	public ResponseEntity<List<FoodCart>> getAllCartsByprodId(long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<FoodCart> createCart(Long itemId, FoodCart newCart)  {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Items addItems(Long restaurantId, Items item)  {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FoodCart showCartById(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FoodCart updateCartById(String cartId, FoodCart cart) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCartById(String cartId) {
		// TODO Auto-generated method stub
		
	}


}
