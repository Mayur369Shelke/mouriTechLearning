package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefoodorderapplication.dto.RestaurantvarificationDto;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;

public interface RestaurantService {

	void addRestaurantInformation(Restaurant restaurant);

	ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant);

	boolean findRestaurantByEmailAndPassword(String restaurantEmail, String restaurantPassword);

	ResponseEntity<?> checkRestauramtEmailAndPassword(RestaurantvarificationDto restaurantDto);

	ResponseEntity<?> insertItems(RestaurantItemsDto restaurantItemsDto);

	Restaurant addRestaurant(Restaurant restaurant);

	List<Restaurant> getAllRestaurant();

	Restaurant getById(Long restaurantId) throws ResourceNotFoundException;

	Restaurant updateRestaurantById(Long restaurantId, Restaurant restaurant) throws ResourceNotFoundException;

	Restaurant deleteRestaurant(Long restaurantId) throws ResourceNotFoundException;



}
