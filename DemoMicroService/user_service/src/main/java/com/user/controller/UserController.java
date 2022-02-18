package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.discovery.DiscoveryClient;
import com.user.dto.UserDto;
import com.user.service.UserService;
import com.user.util.UserContact;
import com.user.util.contact;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	WebClient.Builder webClientBuilder;

	
	@GetMapping("/test/{userId}")
	public UserDto getUser(@PathVariable("userId")int userId) {
		return userService.getuser(userId);
	}
	
	@GetMapping("/{userId}")
	public UserContact getUsers(@PathVariable("userId")int userId) {
		UserDto userDto =  userService.getuser(userId);
	List<contact> contact =restTemplate.getForObject("http://CONTACT-SERVICE/contact/"+userId, List.class);
	
	/*List<contact> contact=	webClientBuilder.build()
												.get()
												.uri("http://CONTACT-SERVICE/contact/"+userId)
												.retrieve()
												.bodyToMono(List.class)
												.block();
	*/
	
	
	UserContact userContact = new UserContact();
	userContact.setUserId(userDto.getUserId());
	userContact.setName(userDto.getName());
	userContact.setContacts(contact);
	return userContact;
		
	}


}

