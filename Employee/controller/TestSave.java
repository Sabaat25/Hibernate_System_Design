package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class TestSave { 
	public static void main(String[] args) {
		Employee employee=new Employee(); 
		employee.setName("Sabaat"); 
		employee.setDesignation("Developer"); 
		employee.setSal(50000); 
		employee.setCno(86555500);
		employee.setEmail("sabaat256@mail"); 
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.saveEmployee(employee);
	} 
}
