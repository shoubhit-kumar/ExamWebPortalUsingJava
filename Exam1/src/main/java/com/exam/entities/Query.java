package com.exam.entities;

public class Query {
	
	private int qid;
	private String subject;
	private String description;
	private int uid;
	
	public Query(int qid, String subject, String description, int uid) {
		super();
		this.qid = qid;
		this.subject = subject;
		this.description = description;
		this.uid = uid;
	}
	
	public Query(String subject, String description, int uid) {
		super();
		this.subject = subject;
		this.description = description;
		this.uid = uid;
	}
	
	public Query() {
		super();
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	
}
