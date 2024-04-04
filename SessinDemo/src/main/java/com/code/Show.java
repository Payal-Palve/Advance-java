package com.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("txtname");
		String acc=request.getParameter("number");
		response.setContentType("text/html");
		pw.println("<h2>name of account holder"+name+"</h2>");
		pw.println("<h3>your account number is"+acc+"</h3>");
	}

}
