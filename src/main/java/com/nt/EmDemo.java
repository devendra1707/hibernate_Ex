package com.nt;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student st = new Student();
		st.setId(2);
		st.setName("Anil");
		st.setCity("Lucknow");

		Certificate cer = new Certificate();
		cer.setCourse("Android");
		cer.setDuration("2 Months");
		st.setCerti(cer);

		Student st2 = new Student();
		st2.setId(3);
		st2.setName("Suraj");
		st2.setCity("Delhi");

		Certificate cer1 = new Certificate();
		cer1.setCourse("Java");
		cer1.setDuration("6 Months");
		st2.setCerti(cer1);

		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		// object save
		s.save(st);
		s.save(st2);
		
		
		tx.commit();
		s.close();
		factory.close();
		
	}
}
