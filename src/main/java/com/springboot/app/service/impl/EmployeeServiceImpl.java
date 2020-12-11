package com.springboot.app.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Employee;
import com.springboot.app.repository.EmployeeRepository;
import com.springboot.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee>employees=employeeRepository.findAll();
		return employees;
	}

	@Override
	public void deleteEmployeeById(Long id) {
		Employee employee=getEmployeeById(id);
		if(employee!=null)
			employeeRepository.delete(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee>optional=employeeRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public Employee getByUuid(UUID uuid) {
		Optional<Employee> employee= employeeRepository.findByUuid(uuid);
		if(employee.isPresent())
			return employee.get();
		return null;
	}

}
