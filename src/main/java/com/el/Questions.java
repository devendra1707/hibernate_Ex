package com.el;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@Column(name = "question_id")
	private int questionId;
	@Column(name = "question")
	private String question;

	@OneToMany(mappedBy = "questions", fetch = FetchType.EAGER)
	private List<Answers> answers;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int questionId, String question, List<Answers> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	

}
