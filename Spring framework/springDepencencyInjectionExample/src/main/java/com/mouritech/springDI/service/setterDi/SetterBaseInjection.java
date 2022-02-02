package com.mouritech.springDI.service.setterDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springDI.service.MessageService;

@Component
public class SetterBaseInjection {
	
	private MessageService msgService;

	public MessageService getMsgService() {
		return msgService;
	}

	@Autowired
	@Qualifier("phoneService")
	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMessage(String message) {
		msgService.sendMessage(message);
	}

}
