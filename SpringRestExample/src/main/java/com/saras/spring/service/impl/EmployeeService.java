package com.saras.spring.service.impl;

import java.util.List;

import com.saras.spring.model.Employee;

public interface EmployeeService {
	public Employee getEmployeeId(int id);
	public void persist(Employee employee);
	public void persistAll(List<Employee> employees);
	public void update(Employee employee);
	public List<Employee> findAll();
	public void remove(int id);
}
