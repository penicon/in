package com.penchal.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		StudentDetails sd=new StudentDetails();
		sd.setStudentId(101);
		sd.setStudentName("RAMA");
		sd.setStudentAddress("Hyderabad");
		sd.setStudentDOB(new Date());
		sd.setStudentFee(150.20);
		
      /*StudentDetails sd2=new StudentDetails();
		
		sd2.setStudentName("BALA");
		sd2.setStudentAddress("Mumbai");
		sd2.setStudentDOB(new Date());
		sd2.setStudentFee(180.60);
		*/
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(sd);
		session.getTransaction().commit();
		session.close();
		
		sd=null;
	    
		session=sessionFactory.openSession();
		session.beginTransaction();
		sd=(StudentDetails)session.get(StudentDetails.class,101);			
		System.out.println("Getting Student Id : "+sd.getStudentId());
		System.out.println("Getting Student Id : "+sd.getStudentName());
		
		
		System.out.println("Getting Student Id : "+session.load(StudentDetails.class,101));
		System.out.println("Getting Load Objects : "+sd.getStudentAddress());
}
}