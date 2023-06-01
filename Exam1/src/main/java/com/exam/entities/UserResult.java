package com.exam.entities;

import java.sql.Date;

public class UserResult {

	private int rid;
	private int uid;
	private int cid;
	private float mark;
	private String status;
	private Date datetime;
	public UserResult(int rid, int uid, int cid, float mark, String status, Date datetime) {
		super();
		this.rid = rid;
		this.uid = uid;
		this.cid = cid;
		this.mark = mark;
		this.status = status;
		this.datetime = datetime;
	}
	public UserResult(int uid, int cid, float mark, String status, Date datetime) {
		super();
		this.uid = uid;
		this.cid = cid;
		this.mark = mark;
		this.status = status;
		this.datetime = datetime;
	}
	public UserResult(int uid, int cid, float mark, String status) {
		super();
		this.uid = uid;
		this.cid = cid;
		this.mark = mark;
		this.status = status;
	}
	
	public UserResult() {
		super();
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
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
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
