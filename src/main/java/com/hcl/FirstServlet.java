package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("texthtml");
		PrintWriter pw=res.getWriter();
		ServletContext ctx=getServletContext();
		ctx.setAttribute("org", "HCL");
		pw.println("<h1>Welcome to the world of Servlet</h1>");
		pw.println("<a href='second'>Second Servlet</a>");
		
		pw.close();//close the stream
		
		
	}

}
