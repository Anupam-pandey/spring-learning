package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Course;
import com.anupam.hibernate.demo.entity.Instructor;
import com.anupam.hibernate.demo.entity.InstructorDetail;
import com.anupam.hibernate.demo.entity.Review;
import com.anupam.hibernate.demo.entity.Student;


public class DeleteStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {	
			session.beginTransaction();
			int id = 2;
			Student s = session.get(Student.class, id);
			System.out.println(s.getCourses());
			session.delete(s);
//			Course c2 = new Course("test course 2");
//			Course c3 = new Course("test course 3");
//			
//			c2.addStudent(s);
//			c3.addStudent(s);
//			
//			session.save(c3);
//			session.save(c2);
//			
			
						
//			Student s1 = new Student("hi", "there","abc@xyz.com");
//			Student s2 = new Student("hiw", "thee","abcd@xyz.com");
//			Student s3 = new Student("hie", "ther","abce@xyz.com");
//			
//			c.addStudent(s1);
//			c.addStudent(s2);
//			c.addStudent(s3);
//			
//			session.save(s1);
//			session.save(s2);
//			session.save(s3);
//			session.save(c);


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
