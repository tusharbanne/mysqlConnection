package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/department")
	public Department getDepartment(@RequestParam("name") String name) {
		return departmentService.getDepartment(name);
	}
	
	@PostMapping("/department")
	public String addDepartment(@RequestBody DepartmentDto departmentDto) {
		return departmentService.addDepartment(departmentDto);
	}
	

	@PostMapping("/employee")
	public String addEmployee(@RequestBody EmployeeDto employee) {
		return employeeService.addEmployee(employee);
	}
	
}
