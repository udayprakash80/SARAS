package com.saras.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.saras.spring.model.Employee;
 
@Repository
@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	public Employee getEmployeeId(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		logger.info("Employee loaded successfully, Person details = "+ employee);
		return employee;
	}
	
	@Override
	public void persist(Employee employee){
		logger.info("Persist: " + employee);
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(employee);
		logger.info("Employee saved successfully");
	}
	
	@Override
	public void persistAll(List<Employee> employees){
		for(Employee employee : employees){
			persist(employee);
		}
		logger.info("All Employee saved successfully");
	}
	
	@Override
	public void update(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
		logger.info("Employee updated successfully");
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> findAll(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employees = session.createQuery("FROM Employee").list();
		for(Employee employee : employees){
			logger.debug("Employee List: " + employee);
		}
		return employees;
	}

	@Override
	public void remove(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		if(employee != null){
			session.delete(employee);
		}
		logger.info("Employee deleted successfully, Employee details = " + employee);
	}
}
