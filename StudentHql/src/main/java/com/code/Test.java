package com.code;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {

		try (SessionFactory sf = Hbutil.getSf(); Session s = sf.openSession();) {
			
			//hql select query
//			String str="from Student where marks=80";
//			Query q=s.createQuery(str);
//			List<Student>li=q.list();
//			for(Student cust:li) {
//				System.out.println(cust);
//			}

			Query q=s.createQuery("delete from Student where marks=:a");
			q.setParameter("a", 80);
			int j=q.executeUpdate();
			System.out.println(j);
			Transaction transaction = s.beginTransaction();
			System.out.println("done");
            
			transaction.commit();
			s.close();

		} catch (Exception e) {
			e.printStackTrace();
			// Handle exception
		}

	}
}
