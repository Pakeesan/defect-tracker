package com.defect.tracker.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.server.service.EmailService;
import com.defect.tracker.server.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/Employee")
	public String saveEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		emailService.sendMail("sanpakees@gmail.com", employee.getName()+"Employee created", employee.getName());
		return "added";
	}
	@GetMapping("/Employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	@PutMapping("/Employee")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "updated";
	}
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable Long id){
		 return employeeService.getEmployeeById(id);			
	}
	
	@DeleteMapping("/Employee/{id}")
	public String deleteEmployeeById(@PathVariable Long id){
		  employeeService.deleteEmployeeById(id);	
		  return "deleted";
	}

}
