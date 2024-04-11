package com.code;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {

	@Id
	private int depId;
	
	 private String Dept_Name;
	 
	 @OneToMany
	 private List<Employee >emp;

	public Department() {
		super();
	}

	

	public Department(int depId, String dept_Name, List<Employee> emp) {
		super();
		this.depId = depId;
		Dept_Name = dept_Name;
		this.emp = emp;
	}



	public int getDepId() {
		return depId;
	}



	public void setDepId(int depId) {
		this.depId = depId;
	}



	public String getDept_Name() {
		return Dept_Name;
	}



	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}



	public List<Employee> getEmp() {
		return emp;
	}



	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}



	@Override
	public String toString() {
		return "Department [depId=" + depId + ", Dept_Name=" + Dept_Name + ", emp=" + emp + "]";
	}



	
	 
	
}
