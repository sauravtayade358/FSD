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


@WebServlet("/updates")
public class UpdateStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String cname=request.getParameter("cname");
		
		String param=request.getParameter("id");
		int id= Integer.parseInt(param);
		
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("update students set name=?, cname=? where id=?");
				stmt.setString(1, name);
				
				stmt.setString(2, cname);
				
				
				stmt.setInt(3, id);
				
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					System.out.print(rs+" rows updated in database");
					response.sendRedirect("fetchstudent");
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