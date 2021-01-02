package com.springboot.app.controller;

import com.springboot.app.model.User;
import com.springboot.app.service.MailService;
import com.springboot.app.service.UserService;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/signin")
	public String userLogin() {
		return "user-signin";
	}

	@GetMapping("/signup")
	public String userSignUp() {
		return "user-signup";
	}

	@PostMapping("/create")
	public String saveUser(@RequestParam(name = "name") String name, @RequestParam(name = "surname") String surname,
			@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
		User user = new User();
		user.setUuid(UUID.randomUUID());
		user.setName(name);
		user.setSurname(surname);
		user.setEmail(email);
		user.setPassword(password);
		userService.saveUser(user);
		return "redirect:/user/signin?message=usercreated";
	}
}
