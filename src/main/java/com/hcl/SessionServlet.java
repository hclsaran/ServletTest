package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("texthtml");
		PrintWriter pw=res.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pwd");
		if(username.equals("Julian")&& password.equals("123")) {
			pw.println("Welcome "+username);
			HttpSession session=req.getSession();
			session.setAttribute("name", username);
		}else {
			pw.println("Invalid Username/Password");
			req.getRequestDispatcher("session.jsp").include(req, res);
			//include and forward
		}
		
		 
		
		
		
		pw.close();//close the stream
		
		
	}

	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
      doGet(req,res);
	}
}
