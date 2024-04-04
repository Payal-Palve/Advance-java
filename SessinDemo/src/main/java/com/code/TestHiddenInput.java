package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sessiondemo")
public class TestHiddenInput extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		
		String uname=request.getParameter("txtname");
		String password=request.getParameter("txtpwd");
		
		if(uname.equals("payal" )&&(password.equals("123"))) {
			pw.println("<form action='show' method='get' ");
			pw.println("<h3>Account number</h3>");
			pw.println("<input type='text' name='number' ><br><br>");
			pw.println("<input type='hidden' name='txtname' value='"+uname+"'>");
			pw.println("<input type='submit' value='next' ><br><br>");
			pw.println("</form>");
			
		}else {
			response.sendRedirect("index.html");
		}
		
	}

}
