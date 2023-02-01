package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args)
	{
SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int n = 3;
			session.beginTransaction();
			while(n>0)
			{
				Student stu = new Student("anu"+n,"pam","abc@g.com");
				
				session.save(stu);
				n--;
				
			}
			
			if(session.getTransaction().isActive())
			{
				session.getTransaction().commit();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
