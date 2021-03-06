package com.mouritech.seller.service;

import java.util.List;

import com.mouritech.seller.entity.Seller;
import com.mouritech.seller.exception.SellerNotFoundException;

public interface SellerService {

	void saveSeller(Seller seller);

	List<Seller> getAllSeller();

	Seller getById(long sellid) throws SellerNotFoundException;

	void deleteSeller(long sellid);

	void updateSeller(long sellid, Seller thenewseller);

}
