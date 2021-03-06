package com.mouritech.seller.controller;

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

import com.mouritech.seller.entity.Seller;
import com.mouritech.seller.exception.SellerNotFoundException;
import com.mouritech.seller.service.SellerService;


@RestController
@RequestMapping("/rest/s1")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/seller")
	public ResponseEntity<?> saveSeller(@RequestBody Seller seller){
		sellerService.saveSeller(seller);
		return ResponseEntity.ok().body("new Seller Added");
	}
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getSeller(){
		List<Seller> sellerList = sellerService.getAllSeller();
		return ResponseEntity.ok().body(sellerList);
		
	}
	
	@GetMapping("/seller/{sellerId}")
	public ResponseEntity<Seller> getById(@PathVariable("sellerId") long sellid) throws SellerNotFoundException{
		Seller seller = sellerService.getById(sellid);
		return ResponseEntity.ok().body(seller);
		
		
	}
	
	@DeleteMapping("/seller/{sellerId}")
	public ResponseEntity<?> deleteById(@PathVariable("sellerId") long sellid){
		sellerService.deleteSeller(sellid);
		return ResponseEntity.ok().body("seller deleted sucessfully");
	}

	@PutMapping("/seller/{sellerId}")
	public ResponseEntity<?> updateSeller(@PathVariable("sellerId") long sellid,@RequestBody Seller thenewseller){
		sellerService.updateSeller(sellid,thenewseller);
		return ResponseEntity.ok().body("seller updated sucessfully");
		
	}
	
	
}
