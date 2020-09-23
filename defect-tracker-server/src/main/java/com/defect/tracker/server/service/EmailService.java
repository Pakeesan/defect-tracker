package com.defect.tracker.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private SimpleMailMessage preConfiguredMessage;
	
	
	  
	public void sendMail(String to, String subject, String body) {
		    SimpleMailMessage message = new SimpleMailMessage();
		    message.setFrom(preConfiguredMessage.getFrom());
		    message.setTo(to);
		    message.setSubject(subject);
		    message.setText(body);
		    mailSender.send(message);
		  }
}
