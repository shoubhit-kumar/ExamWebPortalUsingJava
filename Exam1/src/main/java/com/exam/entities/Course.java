package com.exam.entities;

public class Course {
	
	private int cid;
	private String name;
	public Course(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public Course(String name) {
		super();
		this.name = name;
	}
	public Course() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
