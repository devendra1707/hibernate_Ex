package com.el;

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

//		Questions q1 = new Questions();
//		q1.setQuestionId(1);
//		q1.setQuestion("What is Java?");
//
//		// Creating Answer
//
//		Answers ans = new Answers();
//		ans.setAnswerId(343);
//		ans.setAnswer("Java is Programming Language.");
//		ans.setQuestions(q1);
////		q1.setAnswer(ans);

//		Answers ans1 = new Answers();
//		ans1.setAnswerId(43);
//		ans1.setAnswer("With The help of java we can create App..");
//		ans1.setQuestions(q1);
//
//		Answers ans2 = new Answers();
//		ans2.setAnswerId(33);
//		ans2.setAnswer("Java has Different type of framework..");
//		ans2.setQuestions(q1);
////
//		List<Answers> list = new ArrayList<>();
//		list.add(ans);
//		list.add(ans1);
//		list.add(ans2);

		//q1.setAnswer(list);

//		// Creating Question
//
//		Questions q2 = new Questions();
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
////		// save
//		s.save(q1);
//		s.save(ans);
//		s.save(ans1);
//		s.save(ans2);

//		s.save(q1);
//		s.save(q2);
//		s.save(ans);
//		s.save(ans2);

		Questions q = (Questions)s.get(Questions.class, 1);
		System.out.println(q.getQuestion());
		System.out.println(q.getQuestionId());
		System.out.println(q.getAnswers().size());
		
		tx.commit();

		// fetching ........
//		Question newQ = (Question) s.load(Question.class, 1);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());

		s.close();
		factory.close();
	}
}
