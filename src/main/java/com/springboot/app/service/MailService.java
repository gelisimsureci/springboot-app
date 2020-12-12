package com.springboot.app.service;

public interface MailService {
    void sendMailTo (String subject,String content,String[] to);
    void sendMailToAnCc (String subject,String content,String[] to,String[] cc);
}
