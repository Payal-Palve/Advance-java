package util;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_In_data")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type")
@DiscriminatorValue( value = "employee")
public class Employee {


		@Id
		private int id;
		
		private String emp_name;
		
		private Double salary;

		public Employee() {
			super();
		}
		

		public Employee(int id, String emp_name, Double salary) {
			super();
			this.id = id;
			this.emp_name = emp_name;
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
		}
		
		

}
