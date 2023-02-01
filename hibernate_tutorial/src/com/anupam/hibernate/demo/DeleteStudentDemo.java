package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Student;


public class DeleteStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Student stu = new Student("daffy","pam","abc@g.com");
			session.beginTransaction();
			session.save(stu);
			session.getTransaction().commit();
			
			System.out.println("saved student id "+stu.getId());
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student stu2 = session.get(Student.class, stu.getId());
			System.out.println(stu2.toString());
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
