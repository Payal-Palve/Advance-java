package com.pojo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_data")
public class Employee {

	@Id
	private int id;
	
	private String emp_name;
	
	private Double salary;
	@Embedded
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int id, String emp_name, Double salary,Address add) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.address=add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", salary=" + salary +"adddress= "+address +"]" ;
	}
	
	
}
