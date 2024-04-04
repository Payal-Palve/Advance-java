package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Httpsessiondemo
 */
public class Httpsessiondemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("txtname");
		String pwd=request.getParameter("txtpwd");
		
		if(name.equals("abc")&& pwd.equals("123")) {
			
			HttpSession session=request.getSession();
			session.setAttribute("custname","mona darling");
			session.setAttribute("age","40");
			session.setAttribute("city","Gorakhpur");
			out.println("<form action='show2' ");
			out.println("<h3>Account number</h3>");
			out.println("<input type='text' name='number'><br><br>");
			out.println("<input type='submit' value='next'><br><br>");
			out.println("</form>");

		}
		else {
			response.sendRedirect("index.html");
		}
	
	}

}
