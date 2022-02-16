package com.simplilearn.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		String fname=request.getParameter("fname");
		PreparedStatement pst;
		ResultSet rs;
		
		
		out.print("<h1>Product Details</h1><hr>");
		
		
		try {
		   pst=conn.prepareStatement("select * from eproduct where fname=?");
		   pst.setString(1, fname);
		   rs=pst.executeQuery();
		   int flag = 0;
		   
		   
			while(rs.next())
			{
				
				out.print(rs.getString("fname")+" "+rs.getString("os")+" "+rs.getString("price")+" "+ rs.getString(5)+" ");
				flag++;
				out.println("Product Found")	;
			}
			
				
			if(flag == 1) {
				out.println("Exist")	;
			} else {
				out.println("Product Not FOUND")	;
			}
		    
            
            }
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		
		
		
		}
	
		
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
