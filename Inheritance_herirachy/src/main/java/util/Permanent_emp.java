package util;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Emp_In_data")

@DiscriminatorValue( value = "permanent_employee")
public class Permanent_emp extends Employee{
	
	private String Deptname;
	
	private String designation;

	public Permanent_emp() {
		super();
	}

	public Permanent_emp(int id, String emp_name, Double salary,String deptname, String designation) {
		super(id,emp_name,salary);
		Deptname = deptname;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return super.toString()+"Permanent_emp [Deptname=" + Deptname + ", designation=" + designation + "]";
	}
	
	

}
