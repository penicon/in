package com.penchal.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.penchal.model.FourWheeler;
import com.penchal.model.TwoWheeler;
import com.penchal.model.Vehical;



public class HibernateInsertTest {

	public static void main(String[] args) {
		
 Vehical v=new Vehical();
 v.setVehicalName("Car");
 
TwoWheeler bike=new TwoWheeler();
bike.setVehicalName("Bike Apache");
bike.setSteeringHandler("Bike Streering ....");

FourWheeler car=new FourWheeler();
car.setVehicalName("Forche");
car.setSteeringWheeler("Car streering....");

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
        session.save(v);
        session.save(bike);
        session.save(car);
		session.getTransaction().commit();
		

		
	}
}
