package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sabaat");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	// To save the Details
	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		return employee;
	}
	
	//To Delete the Details
	public Employee deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		
		if(employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		else {
			System.out.println("Not deleted");
		}
		return employee;
	}
	
	//To Update The Details
	public Employee updateEmployeeById(int id,long cno ,String email) {
		
		Employee employee = entityManager.find(Employee.class, id); 
		employee.setCno(cno);
		employee.setEmail(email); 
		
		if(employee!=null) {
			entityTransaction.begin(); 
			entityManager.merge(cno);
			entityManager.merge(employee);
			entityTransaction.commit();
			
		}
		
		return employee;
		
	}
	
	//To View The Specific Detail
	public Employee getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, 1);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName()); 
		System.out.println(employee.getDesignation()); 
		System.out.println(employee.getSal()); 
		System.out.println(employee.getCno());
		System.out.println(employee.getEmail());
		
		return employee;
	}
	
	//To View The All Details
	public List<Employee> getAllEmployee() {
		String sql = "SELECT e FROM Employee e";  		
		Query query = entityManager.createQuery(sql); 		
		List<Employee> employees = query.getResultList();
		
		for(Employee e : employees) {
			System.out.println("================");
			System.out.println(e.getId());
			System.out.println(e.getName()); 
			System.out.println(e.getDesignation()); 
			System.out.println(e.getSal()); 
			System.out.println(e.getCno());
			System.out.println(e.getEmail());
			System.out.println("================");			
		}
		return employees;
	}
	
	
}