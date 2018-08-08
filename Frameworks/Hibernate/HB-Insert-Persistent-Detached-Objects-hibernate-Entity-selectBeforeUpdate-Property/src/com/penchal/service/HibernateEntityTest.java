package com.penchal.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.penchal.model.StudentDetails;

public class HibernateEntityTest {

	public static void main(String[] args) {
		
		
		StudentDetails sd=new StudentDetails();
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();		
		Session session=sessionFactory.openSession();
		session.beginTransaction();	
		
		
         session.save(sd);    		
		
         
         session.getTransaction().commit();
		session.close();
	// see the Student details@org.hibernate.annontation.Entity
		
		sd.setStudentName("Changed Object in Detached State Before Session opened to update process ");
		
		session=sessionFactory.openSession();
		session.beginTransaction();			
         session.update(sd);        // output:Changed Object in Detached State Before Session opened to update process
		session.getTransaction().commit();
		session.close();
		

		
	}
}
