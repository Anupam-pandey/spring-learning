package com.anupam.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anupam.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		Session currentSession  = sessionFactory.getCurrentSession() ;
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName",Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session currentSession  = sessionFactory.getCurrentSession() ;
		currentSession.saveOrUpdate(customer);		
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session sess = sessionFactory.getCurrentSession();
		Customer c = sess.get(Customer.class, customerId);
		return c;
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session sess = sessionFactory.getCurrentSession();
//		sess.delete(customerId);
		Query q  = sess.createQuery("delete from Customer where id=:customerId");
		q.setParameter("customerId", customerId);
		q.executeUpdate();
		
	}

}
