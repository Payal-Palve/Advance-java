package com.code;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class MyTagHandlerDate extends TagSupport{

	@Override
	public int doStartTag() throws JspException{
		
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h1>"+ Calendar.getInstance().getTime()+" </h1>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}
}
