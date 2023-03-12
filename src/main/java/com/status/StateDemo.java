package com.status;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.Certificate;
import com.nt.Student;

public class StateDemo {
	public static void main(String[] args) {
		// Practical of Hebernate Object States:
		// Transient
		// Persistent
		// Detached
		// Removed
		System.out.println("Eample :");

		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Creating Student Object

		Student student = new Student();
		student.setId(12);
		student.setName("Lakhan");
		student.setCity("Delhi");
		student.setCerti(new Certificate("Java Hibernate Course", "2 Months"));
		// Student : Transient

		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		// student : Persistent session,database
		student.setName("John");
		tx.commit();
		s.close();
		
		// student : Detached State
		student.setName("Sachin");
		System.out.println(student);
		f.close();
	}
}
