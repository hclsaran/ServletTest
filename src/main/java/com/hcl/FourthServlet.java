package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FourthServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("texthtml");
		PrintWriter pw = res.getWriter();
		HttpSession session=req.getSession();
		String s = (String) session.getAttribute("name");
		pw.println("Hello   :" + s);

	}
}
