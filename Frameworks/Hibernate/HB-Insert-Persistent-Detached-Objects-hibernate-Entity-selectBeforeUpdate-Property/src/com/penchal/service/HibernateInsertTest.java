package com.penchal.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		
		StudentDetails sd=new StudentDetails();
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();		
		Session session=sessionFactory.openSession();
		session.beginTransaction();				
         session.save(sd);    		
		session.getTransaction().commit();
		session.close();
	
		
		sd.setStudentName("User Name is Updated After Session Closed ...");
		
		session=sessionFactory.openSession();
		session.beginTransaction();	

		
		sd.setStudentName("User Name is Updated Session  Persistant State -----");
		
         session.update(sd);    		
        
         sd.setStudentName("User Name is Updated Session  Persistant State ----- After update method ---Before session close");
         
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
        
	}
}
