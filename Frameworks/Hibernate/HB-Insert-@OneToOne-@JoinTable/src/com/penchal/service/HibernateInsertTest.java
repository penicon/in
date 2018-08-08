package com.penchal.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.StudentDetails;
import com.penchal.model.VehicalDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		StudentDetails sd=new StudentDetails();

		sd.setStudentName("RAMA");
		
		VehicalDetails vd=new VehicalDetails();
		
		vd.setVehicalName("TOYOTO");
		
		

        sd.setVehicalDetails(vd);
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(sd);
		session.save(vd);
		session.getTransaction().commit();
		

		
	}
}
