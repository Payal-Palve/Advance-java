package com.code;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hbutil {
	
	private static SessionFactory sf;
	
	public static SessionFactory getSf() {
		
		Configuration config=new Configuration();
		config.configure();
		
		sf=config.buildSessionFactory();
		System.out.println("connection sf done------------------");
		
		return sf;
		
	}

}
