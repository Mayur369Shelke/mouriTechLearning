package com.mouritech.onlinefoodorderapplication.service;

import com.mouritech.onlinefoodorderapplication.entity.Items;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;

public interface ItemService {

	Items addItems(Long restaurantId, Items items) throws ResourceNotFoundException;

}
