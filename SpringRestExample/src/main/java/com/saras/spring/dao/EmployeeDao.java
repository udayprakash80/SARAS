package com.saras.spring.dao;

import java.util.List;

import com.saras.spring.model.Employee;

public interface EmployeeDao {
	public Employee getEmployeeId(int id);
	public void persist(Employee employee);
	public void persistAll(List<Employee> employees);
	public void update(Employee employee);
	public List<Employee> findAll();
	public void remove(int id);
}
