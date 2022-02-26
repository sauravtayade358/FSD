package com.sl.user;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchclass")
public class Fetchclasses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Properties props= new Properties();
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		props.load(in);
		Connection conn= DBCOnfig.getConnect(props);
		
		out.print("<h3>Classes</h3><hr>");
		out.print("<a href='savecl'>ADD Class</a><br><br>");
		if(conn!=null)
		{
			try {
				Statement stmt= conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from classes");
				out.print("<h1>Classes List</h1><hr>");
				out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>ID</th><th>CName</th><th>TName</th>");
				out.print("<th>Delete</th><th>Update</th></tr>");
				
				while(rs.next())
				{
					out.print("<tr>");
					out.print("<td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+
				"<td>"+rs.getString(3)+"</td>");
					
					out.print("<td>"+"<a href='deleteclass?id="+rs.getInt(1)+"'>deletesub</a>"+"</td>");
					out.print("<td>"+"<a href='updatepagec?id="+rs.getInt(1)+"'>updatepage</a>"+"</td>");
					
					out.println("</tr>");
				}
				out.println("</table>");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			out.print("Error while connecting with DB");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}