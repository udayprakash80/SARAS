package com.saras.spring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.saras.spring.dao.EmployeeDao;
import com.saras.spring.model.Employee;
import com.saras.spring.service.EmployeeService;


@Service
@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao){
		this.employeeDao = employeeDao;
	}
	
	@Transactional
	public Employee getEmployeeId(int id)
	{
		return employeeDao.getEmployeeId(id);
	}
	
	@Transactional
	public void persist(Employee employee){
		employeeDao.persist(employee);
	}

	@Transactional
	public void persistAll(List<Employee> employees){
		for (Employee employee : employees){
			employeeDao.persist(employee);
		}
	}
	
	@Transactional
	public void update(Employee employee){
		employeeDao.update(employee);
	}
	
	@Transactional
	public List<Employee> findAll(){
		return employeeDao.findAll();
	}
	
	@Transactional
	public void remove(int id){
		employeeDao.remove(id);
	}
}
