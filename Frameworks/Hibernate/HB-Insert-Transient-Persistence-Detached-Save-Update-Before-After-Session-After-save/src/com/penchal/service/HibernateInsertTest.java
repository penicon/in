package com.penchal.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		
		StudentDetails sd=new StudentDetails();
		
		
		// Transient State Object Not inserted into Datbase
		// It means Before hand it out hibernate (means before Session -Save
		sd.setStudentName("User In Transient State -Object ");
		 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();		
		  
		// Persistence State Object  inserted into Datbase
		// It means once  hand it out hibernate it will save  (means  Session -Save
		
		
		sd.setStudentName("User In Persistance  State -Object -Updated ");

		sd.setStudentName("User In Persistance  State -Object -Updated-2  ");
			
         session.save(sd);
           
   		sd.setStudentName("User In Persistance  State -Object -Updated-3  ");
   		
   		//Note :  Before Session.save () and After Session.save() Record will be updated but last record is final setRecord
   		
		session.getTransaction().commit();
		session.close();
		// Detached State Object Not inserted into Datbase
		// It means after  hand it out hibernate it will save  (means  Session -close()
        
	}
}
