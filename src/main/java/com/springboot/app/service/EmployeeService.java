package com.springboot.app.service;

import java.util.List;
import java.util.UUID;

import com.springboot.app.model.Employee;

public interface EmployeeService {
	void saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void deleteEmployeeById(Long id);

	Employee getEmployeeById(Long id);

	Employee getByUuid (UUID uuid);

}
