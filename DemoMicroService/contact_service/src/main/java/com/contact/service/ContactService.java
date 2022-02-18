package com.contact.service;

import java.util.List;

import com.contact.dto.ContactDto;

public interface ContactService {

	List<ContactDto> getlistOfContact(int userId);

}
