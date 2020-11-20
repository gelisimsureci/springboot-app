package com.springboot.app.controller;

import com.springboot.app.model.User;
import com.springboot.app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		User user = new User();
		user.setName("Yasin");
		user.setSurname("Akpınar");
		user.setEmail("zarali@gmail.com");
		user.setPassword("123");
		user.setUuid(UUID.randomUUID());

		userService.saveUser(user);

		return "index";
	}
}
