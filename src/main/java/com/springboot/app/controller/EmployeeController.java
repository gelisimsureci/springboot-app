package com.springboot.app.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String employeeList(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employee-list";
	}

	@GetMapping(value = "/create")
	public String saveEmployee() {
		return "employee-create";
	}

	@PostMapping(value = "/create")
	public String saveEmployeePrg(@RequestParam(name = "name") String name,
			@RequestParam(name = "surname") String surname, @RequestParam(name = "address") String address,
			@RequestParam(name = "gender") String gender,
			@RequestParam(name = "salary", defaultValue = "") BigDecimal salary) {
		Employee employee = new Employee();
		employee.setUuid(UUID.randomUUID());
		employee.setGender(gender);
		employee.setAddress(address);
		employee.setSurname(surname);
		employee.setName(name);
		employee.setSalary(salary);
		employeeService.saveEmployee(employee);
		return "redirect:/employee/employees";
	}
}
