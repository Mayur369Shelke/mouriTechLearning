package com.contact.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.contact.dto.ContactDto;
import com.contact.entity.Contact;

@Component
public class ContactMapper {
	
	@Autowired
	ModelMapper modelMapper;

	public Contact convertDtoToEntity(ContactDto contactDto) {
		return modelMapper.map(contactDto, Contact.class);
	}
	
	public ContactDto convertEntityToDto(Contact contact) {
		return modelMapper.map(contact, ContactDto.class);
	}
}
