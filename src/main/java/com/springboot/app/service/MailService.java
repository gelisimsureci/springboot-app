package com.springboot.app.service;

public interface MailService {
	void sendMailToArray(String subject, String content, String[] to);

	void sendMailTo(String subject, String content, String to);

	void sendMailToArrayAnCcArray(String subject, String content, String[] to, String[] cc);

	void sendMailToAnCc(String subject, String content, String to, String cc);
}
