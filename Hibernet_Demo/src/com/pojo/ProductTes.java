package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;
//import org.hibernate.query.Query;

public class ProductTes {
	
	public static void main(String [] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tr=s.beginTransaction();
		
		Product p=new Product();
		
		//insert operation
		
//		p.setPid(11);
//		p.setPname("mobile");
//		p.setPrice(25000);
//		
		//update
//		p=s.load(Product.class,10);
//		p.setPrice(7000);
//		s.update(p);
		
//		p=s.load(Product.class, 11);
//		System.out.println(p);
//		
//		// Assuming s is your session object
//		Query<Product> query = s.createQuery("FROM Product", Product.class);
//		java.util.List<Product> productList = query.list();
//
//		for (Product product : productList) {
//		    System.out.println(product);
//		}
		
		p=s.load(Product.class, 10);
		s.delete(p);
		

//		s.save(p);
		tr.commit();
		s.close();
	}

}
