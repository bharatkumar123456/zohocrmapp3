package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

   @Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender mailsender;

	@Override
	public void sendSimpleEmail(String to, String subject, String emailBody) {
		   
          SimpleMailMessage mailMessage = new SimpleMailMessage();
          
          mailMessage.setTo(to);
          mailMessage.setSubject(subject);
          mailMessage.setText(emailBody);
          
          mailsender.send(mailMessage);
	}

}
