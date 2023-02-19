package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOJpaImpl(EntityManager e)
	{
		entityManager = e;
	}

	@Override
	public List<Employee> findAll() {
		Query q = entityManager.createQuery("from Employee");
		List<Employee> e  = q.getResultList();
		return e;
	}

	@Override
	public Employee findById(int theId) {
		
		Employee e = entityManager.find(Employee.class,theId);
		return e;
	}

	@Override
	public void save(Employee theEmployee) {
		Employee e = entityManager.merge(theEmployee);
		theEmployee.setId(e.getId());
		
	}

	@Override
	public void deleteById(int theId) {
		
		Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}
