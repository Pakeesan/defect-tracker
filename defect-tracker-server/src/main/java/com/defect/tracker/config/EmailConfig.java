package com.defect.tracker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	
	@Autowired
	private MailProperty mailProperty;
	
	@Bean
	public SimpleMailMessage emailTemplate() {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom(mailProperty.getUserName());
		return message;
	}

}