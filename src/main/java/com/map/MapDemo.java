package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating Question

//		Question q1 = new Question();
//		q1.setQuestionId(1);
//		q1.setQuestion("What is Java?");

		// Creating Answer

//		Answer ans = new Answer();
//		ans.setAnswerId(343);
//		ans.setAnswer("Java is Programming Language.");
//		ans.setQuestion(q1);
////		q1.setAnswer(ans);
//
//		Answer ans1 = new Answer();
//		ans1.setAnswerId(43);
//		ans1.setAnswer("With The help of java we can create App..");
//		ans1.setQuestion(q1);
//
//		Answer ans2 = new Answer();
//		ans2.setAnswerId(33);
//		ans2.setAnswer("Java has Different type of framework..");
//		ans2.setQuestion(q1);
//
//		List<Answer> list = new ArrayList<>();
//		list.add(ans);
//		list.add(ans1);
//		list.add(ans2);

		//q1.setAnswer(list);

//		// Creating Question
//
//		Question q2 = new Question();
//		q2.setQuestionId(2);
//		q2.setQuestion("What is Collection Framework?");
//
//		// Creating Answer
//
//		Answer ans2 = new Answer();
//		ans2.setAnswerId(344);
//		ans2.setAnswer("API to work with Java.");
//		ans2.setQuestion(q2);
//		q2.setAnswer(ans2);

		// Session
		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();
//		// save
//		s.save(q1);
//		s.save(ans);
//		s.save(ans1);
//		s.save(ans2);

//		s.save(q1);
//		s.save(q2);
//		s.save(ans);
//		s.save(ans2);

		Question q = (Question)s.get(Question.class, 1);
		System.out.println(q.getQuestion());
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
		tx.commit();

		// fetching ........
//		Question newQ = (Question) s.load(Question.class, 1);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());

		s.close();
		factory.close();
	}
}
