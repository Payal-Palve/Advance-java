package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Address;
import com.pojo.Employee;

import util.Hbutil;

public class TestEmployee {

	public static void main(String[] args) {
		Address add=new Address("Pune","Maharashtra");
		
		Employee e=new Employee(1,"shamrao",80000d,add);
		SessionFactory sf=Hbutil.getSf();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		s.save(e);
		t.commit();

	}

}
