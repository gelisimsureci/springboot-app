package com.springboot.app.service.impl;

import com.springboot.app.service.MailService;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailServiceImpl implements MailService {

    @Override
    public void sendMailTo(String subject, String content, String[] to) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setText(content);
        msg.setSubject(subject);
        try{

        }
        catch(MailException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void sendMailToAnCc(String subject, String content, String[] to, String[] cc) {

    }
}
