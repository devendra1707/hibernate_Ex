package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();

		Question q1 = new Question();
		q1.setQuestionId(10);
		q1.setQuestion("What is Swing Framework?");
		
		Answer ans6 = new Answer(211, "Use for development.");
		Answer ans7 = new Answer(221, "Desktop Application");
		Answer ans8 = new Answer(231, " Answer");
		
		List<Answer> list = new ArrayList<>();
		list.add(ans6);
		list.add(ans7);
		list.add(ans8);
		
		q1.setAnswer(list);
		
		Transaction tx = s.beginTransaction();
		
//		s.save(q1);
		s.delete(q1);
//		s.save(ans6);
//		s.save(ans7);
//		s.save(ans8);
		
		
		tx.commit();
		s.close();
		factory.close();
	}
}
