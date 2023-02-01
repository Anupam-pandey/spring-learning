package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Student;


public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int id = 1;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student stu = session.get(Student.class, id);
			System.out.println(stu.toString());
			stu.setFirstName("anu");
			
			
			stu = session.get(Student.class, id);
			System.out.println(stu.toString());
			
			session.createQuery("update Student s set email='abc@gmail.com' where s.firstName='anu3'").executeUpdate();
			
			session.getTransaction().commit();
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
		
	}

}
