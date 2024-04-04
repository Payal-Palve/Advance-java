package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Display extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String actno=request.getParameter("number");
		Cookie[] allck=request.getCookies();
		
		for(Cookie var:allck) {
			if(var.getName().equals("name")) {
				out.println("<h2>name of user : "+var.getValue());
			}
			if(var.getName().equals("city")) {
				out.println("<h2>name of user city : "+var.getValue());
			}
		}
		out.println("<h3>acctno : "+actno);
		
	}

}
