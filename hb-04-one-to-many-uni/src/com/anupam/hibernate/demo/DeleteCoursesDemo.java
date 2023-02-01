package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Course;
import com.anupam.hibernate.demo.entity.Instructor;
import com.anupam.hibernate.demo.entity.InstructorDetail;
import com.anupam.hibernate.demo.entity.Student;


public class DeleteCoursesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Instructor ins = new Instructor("anupma","pandey","anu@gm.com");
			InstructorDetail insd = new InstructorDetail("abc/youtube","sleep");
			
			ins.setInstructorDetail(insd);
			
//			Instructor ins2 = new Instructor("anu","pandey","anu@gm.com");
//			InstructorDetail insd2 = new InstructorDetail("abc/youtube","yay");
//			
//			ins2.setInstructorDetail(insd2);
			
			
			session.beginTransaction();
			session.save(ins);
//			session.save(ins2);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}
	}

}
