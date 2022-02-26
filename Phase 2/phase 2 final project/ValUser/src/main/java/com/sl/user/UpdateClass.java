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


@WebServlet("/updatec")
public class UpdateClass extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname=request.getParameter("cname");
		String tname=request.getParameter("tname");
		
		String param=request.getParameter("id");
		int id= Integer.parseInt(param);
		
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("update classes set cname=?, tname=? where id=?");
				stmt.setString(1, cname);
				
				stmt.setString(2, tname);
				
				
				stmt.setInt(3, id);
				
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					System.out.print(rs+" rows updated in database");
					response.sendRedirect("fetchclass");
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
