package com.mouritech.springDI.service;

import org.springframework.stereotype.Service;

@Service("phoneService")
public class PhoneSMSService implements MessageService {

	public void sendMessage(String msg) {
		
		System.out.println(msg+".........sent message using phone");

	}

}
