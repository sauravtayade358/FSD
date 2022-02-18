package com.simplilearn.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		String name=request.getParameter("pname");
		
		String os=request.getParameter("os");
		String processor=request.getParameter("processor");
		String param=request.getParameter("price");
		int price= Integer.parseInt(param);
		
		
		Session session=factory.openSession();		
		
		Transaction tx= session.beginTransaction();
		
		
		Product cust= new Product(name,os,processor,price);
		
		session.save(cust);
		tx.commit();
		session.close();
		response.getWriter().print("Data Inserted");
    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}