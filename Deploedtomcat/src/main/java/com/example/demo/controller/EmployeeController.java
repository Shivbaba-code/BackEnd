package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	
	@Autowired
	//@org.springframework.beans.factory.annotation.Autowired(required=true)
	private EmployeeRepository employeeRepository;

	//@CrossOrigin(origins = "https://student-13c90.web.app")
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	//@CrossOrigin(origins = "https://student-13c90.web.app")
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addEmployees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
}
