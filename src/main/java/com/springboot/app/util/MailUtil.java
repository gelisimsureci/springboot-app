package com.springboot.app.util;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailUtil {

	@Autowired
	private JavaMailSender javaMailSender;
	private SimpleMailMessage msg = new SimpleMailMessage();

	public void sendMail(String subject, String content, String[] cc, String[] to) {
		msg.setSubject(subject);
		msg.setText(content);
		msg.setTo(to);
		if (Objects.nonNull(cc)) {
			msg.setCc(cc);
		}
		javaMailSender.send(msg);
	}
}
