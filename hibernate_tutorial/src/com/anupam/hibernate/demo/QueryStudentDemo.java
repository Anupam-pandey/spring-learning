package com.anupam.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Student> students = session.createQuery("from Student").getResultList();
			displayStudents(students);
			
			students  = session.createQuery("from Student s where s.lastName='pam'").getResultList();
			
			displayStudents(students);
			
			students  = session.createQuery("from Student s where s.firstName='anu' or s.firstName='daffy' ").getResultList();
			
			displayStudents(students);
			
			students  = session.createQuery("from Student s where s.firstName like 'an%'").getResultList();

			displayStudents(students);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			factory.close();
			
		}
	}

	private static void displayStudents(List<Student> students) {
		for(Student s : students)
		{
			System.out.println(s.toString());
		}
	}

}
