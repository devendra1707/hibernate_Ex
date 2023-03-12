package com.nt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started...");
//   SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.isClosed());

		// Creating Student
		Student st = new Student();
		st.setId(101);
		st.setCity("Jaunpur");
		st.setName("Devendra");

		System.out.println(st);

		// Creating object of address class
		Address ad = new Address();
		ad.setStreet("Street1");
		ad.setCity("Delhi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(12);

		// Reading image
		FileInputStream fis = new FileInputStream("src/main/java/im.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

//		Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		///

		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);

//		session.getTransaction().commit();

		tx.commit();

		session.close();
		System.out.println("Done...");
	}
}
