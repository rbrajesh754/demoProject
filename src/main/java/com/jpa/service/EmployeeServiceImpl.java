package com.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.EmployeeDao;
import com.jpa.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	List<Employee> list;

	public EmployeeServiceImpl() {
		list = new ArrayList<Employee>();
		list.add(new Employee(1, "malick", "Developer"));
		list.add(new Employee(2, "malink", "Engineer"));
		list.add(new Employee(3, "malish", "Application"));
		list.add(new Employee(4, "malish", "FrontEnd"));
	}

	@Override
	public List<Employee> getEmployee() {
		return dao.findAll();
	}
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return dao.findById(employeeId).get();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		dao.save(employee);
		return employee;
	}
	@Override
	public Employee updatEmployee(Employee employee) {
		dao.save(employee);
		return employee;
	}
	@Override
	public void deleteEmployee(Integer employeeId) {

		Employee emp = dao.findById(employeeId).get();
		dao.delete(emp);
	}

}
