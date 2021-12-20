package com.jpa.service;

import java.util.List;

import com.jpa.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();

	public Employee getEmployeeById(Integer employeeId);

	public Employee addEmployee(Employee employee);

	public Employee updatEmployee(Employee employee);
	
	public void deleteEmployee(Integer employeeId);
}
