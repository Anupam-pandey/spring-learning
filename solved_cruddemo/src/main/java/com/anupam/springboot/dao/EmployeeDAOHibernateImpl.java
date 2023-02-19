package com.anupam.springboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anupam.springboot.entity.Employee;

import javax.persistence.EntityManager;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager e) {
		
		entityManager  = e;
	}
	
	public EmployeeDAOHibernateImpl() {}

	@Transactional
	public List<Employee> findAll() {
		Session currentSession  =  entityManager.unwrap(Session.class);
		Query<Employee> q = currentSession.createQuery("from Employee",Employee.class);
		List<Employee> emps = q.getResultList();
		return emps;
	}
	

}
