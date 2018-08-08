package com.penchal.service;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
	
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();	
			
		Session session=sessionFactory.openSession();
		session.beginTransaction();
    /*    for (int i = 0; i < 10; i++) {
			StudentDetails s=new StudentDetails();
			s.setStudentName("User Name "+i);
			session.save(s);
			
		}*/
         Query query=session.createQuery(" from StudentDetails ");
	//Query query=session.createQuery(" from StudentDetails where id < 1");
         List users=query.list();    
		 session.getTransaction().commit();
		 session.close();
		 
	     System.out.println("Count of Users : "+users.size());
        
	}
}
