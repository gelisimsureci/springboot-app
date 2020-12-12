package com.springboot.app.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.springboot.app.model.Employee;
import com.springboot.app.service.EmployeeService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		return "redirect:/employee/employees?message=employeecreated";
	}

	@GetMapping(value = "/delete/{uuid}")
	public String removeEmployee(@PathVariable("uuid") UUID uuid) {
		employeeService.deleteEmployeeById(employeeService.getByUuid(uuid).getId());
		return "redirect:/employee/employees";
	}

	@GetMapping(value = "/edit/{uuid}")
	public String updateEmployee(@PathVariable("uuid") UUID uuid, Model model) {
		Employee employee = employeeService.getByUuid(uuid);
		model.addAttribute("employee", employee);
		return "employee-edit";
	}

	@PostMapping(value = "/update/{uuid}")
	public String updateEmployee(@RequestParam(name = "name") String name,
								  @RequestParam(name = "surname") String surname, @RequestParam(name = "address") String address,
								  @RequestParam(name = "gender") String gender,
								  @RequestParam(name = "salary", defaultValue = "") BigDecimal salary,@PathVariable("uuid") UUID uuid) {

		Employee employee = employeeService.getByUuid(uuid);
		employee.setAddress(address);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setSurname(surname);
		employee.setGender(gender);
		employeeService.saveEmployee(employee);
		return "redirect:/employee/employees";
	}

}
