package com.penchal.service;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.StudentAddress;
import com.penchal.model.StudentDetails;

public class HibernateInsertTest {

	public static void main(String[] args) {
		
		StudentDetails sd=new StudentDetails();
		
		sd.setStudentId(101);
		sd.setStudentName("RAMA");		
		sd.setStudentDOB(new Date());
		sd.setStudentFee(150.20);
		
		
		StudentAddress studentAddress=new StudentAddress();
		studentAddress.setStudentDno(102);
		studentAddress.setStudentHomeAddress("SR NAGAR");
		studentAddress.setStudentLane("Andhra Bank Opposite Lane");
		studentAddress.setStudentState("Telangana");
		studentAddress.setZipCode(500038);
		
		
		
		
		sd.setStudentAddress(studentAddress);
		System.out.println("Student Address Added SuccessFully..............");


		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(sd);
		session.getTransaction().commit();
		

		
	}
}
