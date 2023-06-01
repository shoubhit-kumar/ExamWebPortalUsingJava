package com.exam.entities;

import java.sql.Date;

public class Questions {
	private int qid;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private int answer;
	private int cid;
	private Date datetime;
	public Questions(int qid, String question, String option1, String option2, String option3, String option4,
			int answer, int cid, Date datetime) {
		super();
		this.qid = qid;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.cid = cid;
		this.datetime = datetime;
	}
	public Questions(String question, String option1, String option2, String option3, String option4, int answer,
			int cid, Date datetime) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.cid = cid;
		this.datetime = datetime;
	}
	public Questions(String question, String option1, String option2, String option3, String option4, int answer,
			int cid) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.cid = cid;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
