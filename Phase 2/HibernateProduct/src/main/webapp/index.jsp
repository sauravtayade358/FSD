<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Product In Database</h1>
<form action="save" method="post">
Product Name: <input type="text" name="pname"/>
<br><br>


OS: <input type="text" name="os"/>
<br><br>
Processor: <input type="text" name="processor"/>

<br><br>
Price: <input type="number" name="price"/>

<input type="submit" value="Register"/>
</form>

<br><br>
<a href="fetch">Fetch Data</a>


</body>
</html>