package com.sl.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatet")
public class UpdateTeacher extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tname=request.getParameter("tname");
		String sname=request.getParameter("sname");
		
		String param=request.getParameter("id");
		int id= Integer.parseInt(param);
		
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("update teachers set tname=?, sname=? where id=?");
				stmt.setString(1, tname);
				
				stmt.setString(2, sname);
				
				
				stmt.setInt(3, id);
				
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					System.out.print(rs+" rows updated in database");
					response.sendRedirect("fetchteach");
				}
				else
				{
					System.out.println("error while updating a data");
					response.sendRedirect("index.html");
				}
			} catch (Exception e) {
				e.printStackTrace();
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