package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public String addDepartment(DepartmentDto departmentDto) {
		
		Department dept = new Department();
		dept.setDeptHead(departmentDto.getDeptHead());
		dept.setDeptName(departmentDto.getDeptName());
		dept.setProduct(departmentDto.getProduct());
		Department response = departmentRepository.save(dept);
		
		return response.getId().toString();
	}

	public Department getDepartment(String name) {
		return departmentRepository.findByDeptName(name);
	}
}
