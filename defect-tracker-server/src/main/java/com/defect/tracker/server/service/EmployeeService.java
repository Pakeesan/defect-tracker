package com.defect.tracker.server.service;

import java.util.List;

import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Long id);
	public void deleteEmployeeById(Long id);
}
