package com.exam.entities;

public class Answers {

	private int qid;
	private String aoption;
	private int uid;
	private int cid;
	
	public Answers(int qid, String aoption, int uid, int cid) {
		super();
		this.qid = qid;
		this.aoption = aoption;
		this.uid = uid;
		this.cid = cid;
	}
	
	
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getAoption() {
		return aoption;
	}
	public void setAoption(String aoption) {
		this.aoption = aoption;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}
