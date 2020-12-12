package com.springboot.app.service.impl;

import com.springboot.app.service.MailService;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl implements MailService {

	@Override
	public void sendMailTo(String subject, String content, String[] to) {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(to);
		msg.setText(content);
		msg.setSubject(subject);
		try {
			sender.send(msg);
		} catch (MailException ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Override
	public void sendMailToAnCc(String subject, String content, String[] to, String[] cc) {

	}
}
