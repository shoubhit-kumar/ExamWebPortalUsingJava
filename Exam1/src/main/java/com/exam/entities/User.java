package com.exam.entities;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	
	private int id;
	private String name;
    private String email;
    private String password;
    private Date dob;
    private String gender;
    private long contact;
    private String city;
    private String address;
    private Timestamp dateTime;
    private String about;
    private String profile;
    
    
	public User(int id, String name, String email, String password, Date dob, String gender, long contact, String city,
			String address, Timestamp dateTime, String about, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.city = city;
		this.address = address;
		this.dateTime = dateTime;
		this.about = about;
		this.profile = profile;
	}


	public User(String name, String email, String password, Date dob, String gender, long contact, String city,
			String address, String about, String profile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.city = city;
		this.address = address;
		this.about = about;
		this.profile = profile;
	}


	public User() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Timestamp getDateTime() {
		return dateTime;
	}


	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
    
    
    
    
}
