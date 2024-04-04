package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Context extends GenericServlet {
	
	public ServletContext sct =null;
	PrintWriter pw=null;
	public void init(ServletConfig config) throws ServletException {
		sct=config.getServletContext();
		
	}

	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		pw=response.getWriter();
		response.setContentType("text/html");
		int con=Integer.parseInt(sct.getInitParameter("password"));
		pw.println("password : "+con);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		pw.close();
	}
}
