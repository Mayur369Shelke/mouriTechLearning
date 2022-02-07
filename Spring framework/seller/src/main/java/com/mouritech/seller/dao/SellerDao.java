package com.mouritech.seller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.seller.entity.Seller;

@Repository("SellerDao")
public interface SellerDao extends JpaRepository<Seller, Long>{

}
