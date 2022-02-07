package com.mouritech.seller.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.seller.dao.SellerDao;
import com.mouritech.seller.entity.Seller;
import com.mouritech.seller.exception.SellerNotFoundException;

@Service
public class SellerServiceImpl implements SellerService {
	
	@Autowired
	private SellerDao sellerDao;
	
	
	@Transactional
	@Override
	public void saveSeller(Seller seller) {
		
		sellerDao.save(seller);
		
	}
	@Transactional
	@Override
	public List<Seller> getAllSeller() {
	  return sellerDao.findAll();
	}
	@Transactional
	@Override
	public Seller getById(long sellid) throws SellerNotFoundException {
		
		return sellerDao.findById(sellid).orElseThrow(() -> new SellerNotFoundException(sellid));
	}

	@Transactional
	@Override
	public void deleteSeller(long sellid) {
		sellerDao.deleteById(sellid);
		
	}
	@Transactional
	@Override
	public void updateSeller(long sellid, Seller thenewseller) {
		Seller existingSeller = null;
		
		try {
			
			existingSeller = sellerDao.findById(sellid).orElseThrow(() -> new SellerNotFoundException(sellid));
			existingSeller.setSellerName(thenewseller.getSellerName());
			existingSeller.setSelleremail(thenewseller.getSelleremail());
			existingSeller.setSellerCity(thenewseller.getSellerCity());
			existingSeller.setSellerCategory(thenewseller.getSellerCategory());
			existingSeller.setSellerMobNo(thenewseller.getSellerMobNo());
			
			sellerDao.save(existingSeller);
		} catch (SellerNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
