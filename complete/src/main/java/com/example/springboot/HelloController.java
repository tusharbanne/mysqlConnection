package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/files")
	public String getFiles() {
		return "";
	}
	
	@GetMapping("/add")
	public Integer add(@RequestParam Integer benificaryId) {
		return 11;
	}

	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
}
