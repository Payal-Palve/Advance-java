package com.url;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Urlrewritingdemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));

		int k=i+j;
		
		res.sendRedirect("square?k=");
	}

}
