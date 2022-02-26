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

@WebServlet("/saves")
public class createsub extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		PrintWriter out= response.getWriter();
		if(conn!=null)
		{
			
				out.println("<h1>Welcome Admin, Add subject  your system</h1>");
				
					out.print("<form action='save' method='post'>");
					//out.print("<input type='hidden' name='id' >");
					
					out.print("SName: <input type='text' name='sname' ><br><br>");
					
					out.print("<input type='submit' value='Add Data'></form>");
				}
		else {
					System.out.println("No user vailable with provided Id, Register First");
					response.sendRedirect("index.html");
			
		}
		
	}
	

}