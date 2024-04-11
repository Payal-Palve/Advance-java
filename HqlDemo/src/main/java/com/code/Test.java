package com.code;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {

		try (SessionFactory sf = Hbutil.getSf(); Session s = sf.openSession();) {
			
			//hql select query
			//String str="from Customer";
			
			String str="from Customer where cid=12";
			Query q=s.createQuery(str);
		
			List<Customer>li=q.list();
			for(Customer cust:li) {
				System.out.println(cust);
			}

			Transaction t = s.beginTransaction();
			System.out.println("done");
            
		     t.commit();
			
		     //s.close();

		} catch (Exception e) {
			e.printStackTrace();
			// Handle exception
			
		}
		finally {
		}

	}
}
