package com.mouritech.springDI.service;

import org.springframework.stereotype.Service;

@Service("whatsappService")
public class WhatsAppSMSService implements MessageService {

	public void sendMessage(String msg) {
		
		System.out.println(msg+".........sent message using WhatsApp");

	}

}
