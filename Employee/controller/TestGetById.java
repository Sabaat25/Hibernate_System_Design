package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class TestGetById { 
	public static void main(String[] args) {
			EmployeeService employeeService =new EmployeeService();
			employeeService.getEmployeeById(1); 
	} 
}
