package com.springboot.app.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.app.model.Employee;
import com.springboot.app.service.EmployeeService;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/employees")
	public String employeeList() {
		return "employee-list";
	}

	@GetMapping(value = "/create")
	public String saveEmployee() {
		return "employee-create";
	}

	@PostMapping(value = "/create")
	public String saveEmployeePrg(@RequestParam(name = "name") String name,
			@RequestParam(name = "surname") String surname, @RequestParam(name = "address") String address,
			@RequestParam(name = "gender") String gender) {
		Employee employee = new Employee();
		employee.setUuid(UUID.randomUUID());
		employee.setGender(gender);
		employee.setAddress(address);
		employee.setSurname(surname);
		employee.setName(name);
		employeeService.saveEmployee(employee);
		return "redirect:/employee/employees";
	}
}
