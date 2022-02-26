package com.sl.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveteacher")
public class CreateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		String tname=request.getParameter("tname");
		String sname=request.getParameter("sname");
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("insert into teachers (tname,sname) values(?,?)");
				stmt.setString(1, tname);
				stmt.setString(2, sname);
				
				int rs=stmt.executeUpdate();
				
				if(rs>0)
				{   
					System.out.print(rs+" rows insetred in database");
					
					response.sendRedirect("fetchteach");
				}
				else
				{
					System.out.println("error while inserting a data");
					response.sendRedirect("index.html");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			response.getWriter().print("Error while connecting with DB");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}