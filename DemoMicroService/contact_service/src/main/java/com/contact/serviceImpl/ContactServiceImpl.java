package com.contact.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.dto.ContactDto;
import com.contact.entity.Contact;
import com.contact.mapper.ContactMapper;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	ContactMapper contactMapper;


	@Override
	public List<ContactDto> getlistOfContact(int userId) {
	
		List<Contact> contacts = contactRepository.findByUserId(userId);
		List<ContactDto> contactDtos = new ArrayList<>(); 
	for (Contact entity : contacts) {
		ContactDto dto = new ContactDto();
		dto = contactMapper.convertEntityToDto(entity);
		contactDtos.add(dto);
	}
		return contactDtos;

}
	
}
