package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public String addEmployee(EmployeeDto empDto) {
		
		try {
			Employee emp = new Employee();
			Department department = departmentRepository.findByDeptName(empDto.getDepartment().getDeptName());
			emp.setDepartment(department);
			emp.setEmail(empDto.getEmailId());
			emp.setName(empDto.getName());
			
			Employee resp = employeeRepository.save(emp);
			
			return resp.getId().toString();
		}
		catch(Exception e) {
			throw e;
		}
	}
	
}
