package com.penchal.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		
		session.beginTransaction();
		// Insert the Data
		for (int i = 0; i < 10; i++) {
			 StudentDetails sd=new StudentDetails();
			 sd.setStudentName("Users Name: "+i);
			 session.save(sd);
		}
		session.getTransaction().commit();
		session.close();
		/*  
		// Fetch the Data
		
		
	    session=sessionFactory.openSession();
		session.beginTransaction();		
		StudentDetails sd=(StudentDetails) session.get(StudentDetails.class, 5);
		
		System.out.println("User Name is : "+sd.getStudentName());
		session.getTransaction().commit();
		session.close();
		
		//Delete the record
		
		session=sessionFactory.openSession();
		session.beginTransaction();		
		//StudentDetails sd=(StudentDetails) session.get(StudentDetails.class, 5);    Line 33 Casted
		session.delete(sd);
		System.out.println(sd+"   Deleted ");
		session.getTransaction().commit();
		session.close();
		
		// Create Username
		
		
		session=sessionFactory.openSession();
		session.beginTransaction();		
		//StudentDetails sd=(StudentDetails) session.get(StudentDetails.class, 5);    Line 33 Casted
		session.save(sd);
		System.out.println(sd+"  created ");
		session.getTransaction().commit();
		session.close();
		
		*/
		
		//Update the Record
		
		session=sessionFactory.openSession();
		session.beginTransaction();		
		StudentDetails sd=(StudentDetails) session.get(StudentDetails.class,4);   
		sd.setStudentName("Rama");
		System.out.println(sd+"   Updated "+sd.getStudentName());
		session.getTransaction().commit();
		session.close();
		
        
	}
}
