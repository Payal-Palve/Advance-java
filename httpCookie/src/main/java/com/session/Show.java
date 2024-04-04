package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show2")
public class Show extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession st=request.getSession();
		
		String actno=request.getParameter("number");
		
		String name=(String) st.getAttribute("custname");
		String age=(String) st.getAttribute("age");
		String city=(String) st.getAttribute("city");
		
		out.println("<h2>name :"+name+"<br> age : "+age+"<br> city :"+city+"<br>account number : "+actno);
	}

}
