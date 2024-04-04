package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpCookiedemo
 */

public class HttpCookiedemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("txtname");
		String pwd=request.getParameter("txtpwd");
		
		if(name.equals("abc")&& pwd.equals("123")) {
			Cookie ck=new Cookie("name","pwd");
			ck.setMaxAge(20);
			
			Cookie ck2=new Cookie("city","pune");
			response.addCookie(ck);
			response.addCookie(ck2);
			
			out.println("<form action='show' ");
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
