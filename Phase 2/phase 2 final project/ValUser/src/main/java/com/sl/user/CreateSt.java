package com.sl.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/savest")
public class CreateSt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		PrintWriter out= response.getWriter();
		if(conn!=null)
		{
			
				out.println("<h1>Welcome Admin, Add  Student your system</h1>");
				
					out.print("<form action='savestu' method='post'>");
					out.print("Name: <input type='text' name='name' ><br><br>");
					
					out.print("CName: <input type='text' name='cname' ><br><br>");
					
					out.print("<input type='submit' value='Add Student'></form>");
				}
		else {
					System.out.println("No");
					response.sendRedirect("index.html");
			
		}
		
	}
}

	
