package com.penchal.service;

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
		
		VehicalDetails vd1=new VehicalDetails();		
	    vd1.setVehicalName("BUS");		
	    
	   VehicalDetails vd2=new VehicalDetails();		
		vd2.setVehicalName("CAR");
		

        sd.getVehicalDetails().add(vd);
        sd.getVehicalDetails().add(vd1);
        sd.getVehicalDetails().add(vd2);
        
        
        
        vd.getStudentDe().add(sd);
        vd1.getStudentDe().add(sd);
        vd2.getStudentDe().add(sd);
        
        
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(sd);
		session.save(vd);
		session.save(vd1);
		session.save(vd2);
		session.getTransaction().commit();
		

		
	}
}
