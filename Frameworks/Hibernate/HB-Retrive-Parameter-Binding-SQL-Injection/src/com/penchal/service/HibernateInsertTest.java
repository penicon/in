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
		

		 for (int i = 0; i < 10; i++) {
				StudentDetails s=new StudentDetails();
				s.setStudentName("User Name "+i);
				session.save(s);
				
			}
		 
		 
		  String s="StudentDetails";
		  
			Query query=session.createQuery(" from "+s );
		//Query query=session.createQuery(" from StudentDetails where student id < "  +paraId);
	/*	
		query.setFirstResult(2);
		query.setMaxResults(5);*/
		
		List<StudentDetails> users=	(List<StudentDetails>) query.list();
		
		
		session.getTransaction().commit();
		session.close();
			
		for (StudentDetails st : users)
			System.out.println("Users Name  : "+st.getStudentName());
	
}
}