package com.penchal.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	private static final int List = 0;

	public static void main(String[] args) {
		


		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
       

		StudentDetails stud=(StudentDetails)session.get(StudentDetails.class, 1);
		stud.getStudentName();
		
		session.getTransaction().commit();
		session.close();
			
		
		session=sessionFactory.openSession();
		session.beginTransaction();
       
		StudentDetails stud1=(StudentDetails)session.get(StudentDetails.class, 1);
		stud1.getStudentName();
		
		session.getTransaction().commit();
		session.close();
	
}
}