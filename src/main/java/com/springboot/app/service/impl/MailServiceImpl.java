package com.springboot.app.service.impl;

import com.springboot.app.service.MailService;
import com.springboot.app.util.MailUtil;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private MailUtil mailUtil;

	@Override
	public void sendMailToArray(String subject, String content, String[] to) {
		mailUtil.sendMail(subject, content, null, to);
	}

	@Override
	public void sendMailToArrayAnCcArray(String subject, String content, String[] to, String[] cc) {
		mailUtil.sendMail(subject, content, cc, to);
	}

	@Override
	public void sendMailToAnCc(String subject, String content, String to, String cc) {
		mailUtil.sendMail(subject, content, Stream.of(cc).toArray(String[]::new), Stream.of(to).toArray(String[]::new));
	}

	@Override
	public void sendMailTo(String subject, String content, String to) {
		mailUtil.sendMail(subject, content, null, Stream.of(to).toArray(String[]::new));
	}
}
