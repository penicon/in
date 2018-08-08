package com.penchal.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.Addresses;
import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		StudentDetails sd=new StudentDetails();
		

		sd.setStudentName("RAMA");
		
	   Addresses ads=new Addresses();
	   ads.setCity("HYDERABAD");
	   ads.setState("TELANGANA");
       ads.setCountry("INDIA");
		
       Addresses ads1=new Addresses();
       ads1.setCity("MUMBAI");
       ads1.setState("MAHARASTRA");
       ads1.setCountry("INDIA");
	
       Addresses ads11=new Addresses();
       ads11.setCity("BANGALORE");
       ads11.setState("KARNATAKA");
       ads11.setCountry("INDIA");


       sd.getListofAddress().add(ads);
       sd.getListofAddress().add(ads1);
       sd.getListofAddress().add(ads11);



		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(sd);
		session.getTransaction().commit();
		

		
	}
}
