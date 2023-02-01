package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Instructor;
import com.anupam.hibernate.demo.entity.InstructorDetail;
import com.anupam.hibernate.demo.entity.Student;


public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			int id = 1;
			Instructor t =  session.get(Instructor.class,id);
			if(t!=null)
			{
				session.delete(t);
			}
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
