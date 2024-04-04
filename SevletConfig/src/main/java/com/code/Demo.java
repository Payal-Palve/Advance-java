package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet {
	int cnt;
	PrintWriter pw=null;
	
	public void init(ServletConfig config) throws ServletException {
		cnt=Integer.parseInt(config.getInitParameter("name"));
	}
		// TODO Auto-generated method stub
	

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("value of number : "+cnt);
	}
	public void destroy() {
		// TODO Auto-generated method stub
		pw.close();
	}

}
