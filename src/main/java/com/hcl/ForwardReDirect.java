package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForwardReDirect extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("texthtml");
		PrintWriter pw=res.getWriter();
		// res.sendRedirect("https://www.google.com/");
		req.getRequestDispatcher("https://www.google.com/").forward(req, res);
		pw.close();//close the stream
		
		
	}

	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
      doGet(req,res);
	}
}
