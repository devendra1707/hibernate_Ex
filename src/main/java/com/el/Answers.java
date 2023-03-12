package com.el;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answers {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	@Column(name = "answer")
	private String answer;

	@ManyToOne
	private Questions questions;

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int answerId, String answer, Questions questions) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.questions = questions;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	

}
