<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1> Scriplet</h1>
<body>
<%

out.print("Hello from Jsp");
%>
<h1>Declaration to declare varaibles</h1>
<%! int a=20; int b=30 ;%>
<h1>
EXP</h1>
<a href="implicit.jsp"> IMPLICIT</a>
<%= "result is"+a+b %>

<%= java.util.Calendar.getInstance().getTime() %>
</body>
</html>