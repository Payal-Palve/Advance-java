package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
	     Transaction t=s.beginTransaction();
		
		Student st=new Student(45 ,"oldigoldi",61);
		
		System.out.println(st);
		
		s.save(st);
		t.commit();

	}

}
