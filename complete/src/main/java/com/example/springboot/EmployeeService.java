package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee emp) {
		
		try {
			Employee resp = employeeRepository.save(emp);
			return resp.getId().toString();
		}
		catch(Exception e) {
			throw e;
		}
	}
	
}
