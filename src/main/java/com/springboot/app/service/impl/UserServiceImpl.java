package com.springboot.app.service.impl;

import com.springboot.app.constant.MailConstant;
import com.springboot.app.model.User;
import com.springboot.app.repository.UserRepository;
import com.springboot.app.service.MailService;
import com.springboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MailService mailService;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		mailService.sendMailTo(MailConstant.SUCCESS_MESSAGE_SUBJECT, MailConstant.SUCCESS_MESSAGE_CONTENT,
				user.getEmail());
	}

}
