package util;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Emp_In_data")

@DiscriminatorValue( value = "temp_employee")
public class Temp_Employee extends Employee {
	
	
	private String Contrc_name;
	
	private String Con_dept;

	public Temp_Employee() {
		super();
	}

	public Temp_Employee(int id, String emp_name, Double salary,String contrc_name, String con_dept) {
		super(id,emp_name,salary);
		Contrc_name = contrc_name;
		Con_dept = con_dept;
	}

	@Override
	public String toString() {
		return super.toString()+"Temp_Employee [Contrc_name=" + Contrc_name + ", Con_dept=" + Con_dept + "]";
	}
	
	

}
