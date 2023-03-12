package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@Column(name = "question_id")
	private int questionId;
	@Column(name = "question")
	private String question;

//	@OneToOne
//	@JoinColumn(name = "a_id")
//	private Answer answer;

	@OneToMany(mappedBy = "question", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Answer> answer;

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

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	/**
	 * public Answer getAnswer() { return answer; }
	 * 
	 * public void setAnswer(Answer answer) { this.answer = answer; }
	 * 
	 * public Question(int questionId, String question, Answer answer) { super();
	 * this.questionId = questionId; this.question = question; this.answer = answer;
	 * }
	 * 
	 */

}
