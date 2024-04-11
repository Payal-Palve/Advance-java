package com.code;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	private String std_name;
	
	private int Marks;

	public Student() {
		super();
	}

	public Student(int sid, String std_name, int marks) {
		super();
		this.sid = sid;
		this.std_name = std_name;
		Marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", std_name=" + std_name + ", Marks=" + Marks + "]";
	}
	
	

}
