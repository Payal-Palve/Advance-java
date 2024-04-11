package com.code;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private int empid;
	
	private String ename;
	
	private String location;
	
	@ManyToOne
	private Department dept;
	

	public Employee() {
		super();
	}

	public Employee(int empid, String ename, String location, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.location = location;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", location=" + location + ", dept=" + dept + "]";
	}
	

}
