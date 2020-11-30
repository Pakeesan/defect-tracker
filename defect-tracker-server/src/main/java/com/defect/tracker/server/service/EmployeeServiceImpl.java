package com.defect.tracker.server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Transactional
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}
	@Override
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}
	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}


}
