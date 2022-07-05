package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("texthtml");
		PrintWriter pw = res.getWriter();
		ServletContext ctx = getServletContext();
		String s = (String) ctx.getAttribute("org");
		pw.println("Welcome  :" + s);

	}
}
