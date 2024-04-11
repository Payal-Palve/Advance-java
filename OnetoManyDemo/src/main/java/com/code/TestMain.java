package com.code;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestMain {
	
	
	
	

	public static void main(String[] args) {
		
		
		 try (SessionFactory sf = Hbutil.getSf();
	             Session s = sf.openSession();
				) {
		
		Department d= new Department();
		d.setDepId(101);
		d.setDept_Name("IT");
	
//		Department d2=new Department();
//		d2.setDepId(102);
//		d2.setDept_Name("Computer Science");
		
		Employee emp1=new Employee();
		emp1.setEmpid(11);
		emp1.setEname("rahul");
		emp1.setLocation("Pune");
		emp1.setDept(d);
		
		Employee emp2=new Employee();
		emp2.setEmpid(12);
		emp2.setEname("sona");
		emp2.setLocation("satara");
		emp2.setDept(d);

		Employee emp3=new Employee();
		emp3.setEmpid(13);
		emp3.setEname("sham");
		emp3.setLocation("Pune");
		emp3.setDept(d);
		
		Employee emp4=new Employee();
		emp4.setEmpid(14);
		emp4.setEname("girish");
		emp4.setLocation("nanded");
		emp4.setDept(d);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		d.setEmp(list);
		s.save(d);
		s.save(emp1);
		s.save(emp2);
		s.save(emp3);
		s.save(emp4);
		
	
			
      Transaction transaction = s.beginTransaction();
      System.out.println("done");
  
       transaction.commit();
       s.close();
       
   } catch (Exception e) {
       e.printStackTrace();
       // Handle exception
   }   }

}
