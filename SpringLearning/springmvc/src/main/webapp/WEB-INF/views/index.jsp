<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Which is called by HomeController</h1>
	<h2>url /home</h2>
	<%
		String name=(String)request.getAttribute("name");
	
	
	
	%>
	<h3>Author is:<%=name%></h3>
</body>
</html>