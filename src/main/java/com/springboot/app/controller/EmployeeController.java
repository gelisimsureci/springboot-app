package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public String hello() {
		return "index";
	}
}
