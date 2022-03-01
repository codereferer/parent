package com.bharath.boot.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${springjms.queue}")
	private String queue;

	public void send(String message) {
		System.out.println("Message sent : " + message);
		jmsTemplate.convertAndSend(queue, message);
	}
}
