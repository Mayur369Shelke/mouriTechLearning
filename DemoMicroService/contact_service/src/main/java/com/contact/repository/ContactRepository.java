package com.contact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

	List<Contact> findByUserId(int userId);

}
