package com.mouritech.springDI.service;

import org.springframework.stereotype.Service;

@Service("facebookService")
public class FacebookSMSService implements MessageService {

	public void sendMessage(String msg) {

		System.out.println(msg+".........sent message using facebook");
	}

}
