package com.anupam.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anupam.hibernate.demo.entity.Course;
import com.anupam.hibernate.demo.entity.Instructor;
import com.anupam.hibernate.demo.entity.InstructorDetail;
import com.anupam.hibernate.demo.entity.Review;
import com.anupam.hibernate.demo.entity.Student;


public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {	
			session.beginTransaction();
			Course c = new Course("test course");
			Review r = new Review("good");
			Review r2 = new Review("bad");
			Review r3 = new Review("ugly");
			c.addReview(r);
			c.addReview(r2);
			c.addReview(r3);
			session.save(c);
			System.out.println(c.getReviews());
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
