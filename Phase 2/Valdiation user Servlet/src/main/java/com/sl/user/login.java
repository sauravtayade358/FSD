package com.sl.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		 
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		if (uname.equals("Admin") && pass.equals("12344"))
		{
			
			HttpSession session= request.getSession();
			session.setAttribute("key", uname);
			out.println("USER LOGIN");
			response.sendRedirect("Dashboard");
		}
		else {
			
			out.println("LOG IN FAIL , ENTER CORRECT DETAILS");
			
		}
		
	}

}
