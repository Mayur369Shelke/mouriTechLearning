package com.mouritech.springDI.service.contructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springDI.service.MessageService;
@Component
public class ContructorBaseInjection {
	
	private MessageService msgService;
	
	
@Autowired
	public ContructorBaseInjection(@Qualifier("whatsappService")MessageService msgService) {
		super();
		this.msgService = msgService;
	}

	public ContructorBaseInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageService getMsgService() {
		return msgService;
	}

	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMessage(String message) {
		msgService.sendMessage(message);
	}


}
