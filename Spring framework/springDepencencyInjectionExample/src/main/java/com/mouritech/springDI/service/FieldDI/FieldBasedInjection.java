package com.mouritech.springDI.service.FieldDI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springDI.service.MessageService;

@Component
public class FieldBasedInjection {
	
	@Autowired
	@Qualifier("facebookService")
	private MessageService messageService;

	public FieldBasedInjection(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public FieldBasedInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void sendMsg(String message) {
		messageService.sendMessage(message);
	}
	
}
