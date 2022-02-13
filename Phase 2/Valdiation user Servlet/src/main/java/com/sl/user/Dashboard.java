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
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		HttpSession session= request.getSession(false);
		
		if(session!=null)
		{
			String uname=(String) session.getAttribute("key");
		if(uname!=null)
		{
			out.println("  WELCOME  Username is "+ uname + "\n log in success");
			out.print("<a href='logout'>Logout</a>");
		}
		else
		{
			out.print("Kindly Login first");
		}
	}
	}
		
	}
