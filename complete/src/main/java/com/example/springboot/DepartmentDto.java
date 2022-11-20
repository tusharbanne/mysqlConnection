package com.example.springboot;

import javax.persistence.Column;

public class DepartmentDto {

	private String deptName;

	private String deptHead;
	
	private Long deptStrength;
	
	private String product;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public Long getDeptStrength() {
		return deptStrength;
	}

	public void setDeptStrength(Long deptStrength) {
		this.deptStrength = deptStrength;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
