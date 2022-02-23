package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.mouritech.onlinefoodorderapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefoodorderapplication.dto.RestaurantvarificationDto;
import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.mapper.RestaurantItemsMapper;
import com.mouritech.onlinefoodorderapplication.mapper.RestaurantMapper;
import com.mouritech.onlinefoodorderapplication.repository.ItemsRepository;
import com.mouritech.onlinefoodorderapplication.repository.RestaurantRepository;
import com.mouritech.onlinefoodorderapplication.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	ItemsRepository itemsRepository;

@Autowired
RestaurantMapper restaurantMapper;

@Autowired
RestaurantItemsMapper restaurantItemsMapper;

	@Override
	public void addRestaurantInformation(Restaurant restaurant) {
		
		restaurantRepository.save(restaurant);
		
	}

	@Override
	public ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant) {
		
		Restaurant rest = restaurantRepository.findByRestaurantName(restaurant.getRestaurantName());
		if(rest==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not you cant update");
		}
		else {
			rest.setRestaurantName(restaurant.getRestaurantName());
			rest.setRestaurantPassword(restaurant.getRestaurantPassword());
			rest.setRestaurantCity(restaurant.getRestaurantCity());
			rest.setRestaurantState(restaurant.getRestaurantState());
			rest.setRestaurantcountry(restaurant.getRestaurantcountry());
			rest.setRestaurantPincode(restaurant.getRestaurantPincode());
			rest.setRestaurantManagerFirstName(restaurant.getRestaurantManagerFirstName());
			rest.setRestaurantManagerLastName(restaurant.getRestaurantManagerLastName());
			rest.setRestaurantManagerNumber(restaurant.getRestaurantManagerNumber());
			rest.setRestaurantManagerEmail(restaurant.getRestaurantManagerEmail());
			
			final Restaurant restaurantfinal = restaurantRepository.save(rest);
			
			 return ResponseEntity.ok(restaurantfinal);
		}
}

	@Override
	public boolean findRestaurantByEmailAndPassword(String restaurantEmail, String restaurantPassword) {
		boolean flag =false;
		
		Restaurant restaurant = restaurantRepository.findByRestaurantEmailAndRestaurantPassword(restaurantEmail,restaurantPassword);
		if(restaurant==null) {
			return flag;
		}
		else {
			return flag=true;
		}

	}

	@Override
	public ResponseEntity<?> checkRestauramtEmailAndPassword(RestaurantvarificationDto restaurantDto) {
	// Restaurant restaurant = restaurantMapper.convertDtoToEntity(restaurantDto);
	 Restaurant checkEmailExisting = restaurantRepository.findByRestaurantEmail(restaurantDto.getRestaurantEmail());
	 Restaurant checkpasswordExisting = restaurantRepository.findByRestaurantPassword(restaurantDto.getRestaurantPassword());
	 
	 if(checkEmailExisting==null) {
		 
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This email is not present in data base please check email or go to sign in");
		 
	 }
	 else if (checkpasswordExisting==null) {
		
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("password doesnt match");
	}
	
	 else {
		 return ResponseEntity.ok().body("login successful");
	 }
		
	}

	@Override
	public ResponseEntity<?> insertItems(RestaurantItemsDto restaurantItemsDto) {
		
		 Restaurant checkEmailExisting = restaurantRepository.findByRestaurantEmail(restaurantItemsDto.getRestaurantEmail());
		 checkEmailExisting.setItems(null);
		 
		 
		 Restaurant checkpasswordExisting = restaurantRepository.findByRestaurantPassword(restaurantItemsDto.getRestaurantPassword());
		 checkEmailExisting.setRestaurantId(checkpasswordExisting.getRestaurantId());
		
		 if(checkEmailExisting==null) {
			 
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This email is not present in data base please check email or go to sign in");
			 
		 }
		 else if (checkpasswordExisting==null) {
			
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("password doesnt match");
		}
		
		 else {
			 
			 Restaurant restaurant = restaurantItemsMapper.convertDtoToEntity(restaurantItemsDto);
			 
			 checkEmailExisting.setItems(restaurant.getItems());
			 
		
			 itemsRepository.saveAll(checkEmailExisting.getItems());
			 return ResponseEntity.ok().body("items inserted");
		 }
		
	}

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getById(Long restaurantId) throws ResourceNotFoundException {
		Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new ResourceNotFoundException());
		return restaurant;
	}

	@Override
	public Restaurant updateRestaurantById(Long restaurantId, Restaurant restaurant) throws ResourceNotFoundException {
		Restaurant oldrestaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new ResourceNotFoundException());
		
		oldrestaurant.setRestaurantName(restaurant.getRestaurantName());
		oldrestaurant.setRestaurantPassword(restaurant.getRestaurantPassword());
		oldrestaurant.setRestaurantEmail(restaurant.getRestaurantEmail());
		oldrestaurant.setRestaurantAddress(restaurant.getRestaurantAddress());
		
		oldrestaurant.setRestaurantCity(restaurant.getRestaurantCity());
		oldrestaurant.setRestaurantState(restaurant.getRestaurantState());
		oldrestaurant.setRestaurantcountry(restaurant.getRestaurantcountry());
		oldrestaurant.setRestaurantPincode(restaurant.getRestaurantPincode());
		oldrestaurant.setRestaurantManagerFirstName(restaurant.getRestaurantManagerFirstName());
		oldrestaurant.setRestaurantManagerLastName(restaurant.getRestaurantManagerLastName());
		oldrestaurant.setRestaurantManagerNumber(restaurant.getRestaurantManagerNumber());
		oldrestaurant.setRestaurantManagerEmail(restaurant.getRestaurantManagerEmail());
		
		Restaurant restaurantNew = restaurantRepository.save(oldrestaurant);
		return restaurantNew;
	}

	@Override
	public Restaurant deleteRestaurant(Long restaurantId) throws ResourceNotFoundException {
		
		Restaurant oldrestaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new ResourceNotFoundException());
		restaurantRepository.delete(oldrestaurant);
		return oldrestaurant;
	}

	@Override
	public Restaurant AddItems(Long restaurantId, Restaurant restaurant) throws ResourceNotFoundException {
		
		Restaurant oldrestaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new ResourceNotFoundException());
		oldrestaurant.setItems(restaurant.getItems());
		restaurantRepository.save(oldrestaurant);
		
		return oldrestaurant;
	}

	



}
