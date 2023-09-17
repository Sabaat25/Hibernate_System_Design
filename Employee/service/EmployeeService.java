package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao = new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	public Employee deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	public Employee updateEmployeeById(int id,long cno ,String email) {
		return updateEmployeeById(id, cno, email);
				
	}

	
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
