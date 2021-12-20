package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Employee;
import com.jpa.service.EmployeeService;

@RestController
//@RequestMapping("home")
public class JpaController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return this.service.getEmployee();
	}	
	@GetMapping("/employee/{employeeId}")
	public Employee employeeById(@PathVariable Integer employeeId) {
		return this.service.getEmployeeById(employeeId);
	}	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.service.addEmployee(employee);
	}
	@PutMapping("/employee")
	public Employee updatEmployee(@RequestBody Employee employee) {
		return this.service.updatEmployee(employee);
	}
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Integer employeeId){
		try {
			this.service.deleteEmployee((employeeId));
			return new ResponseEntity<>(HttpStatus.OK);	
		}catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}



















