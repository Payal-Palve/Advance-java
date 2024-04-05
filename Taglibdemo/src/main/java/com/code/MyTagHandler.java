package com.code;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class MyTagHandler extends TagSupport {
	@Override
	public int doStartTag() throws JspException{
		
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h1> Welcome to custom </h1>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}

}
