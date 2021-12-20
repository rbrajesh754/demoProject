package com.jpa.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
