<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>Help Page</h1>
	<%
		//String name=(String)request.getAttribute("name");
		//int roll=(int)request.getAttribute("roll");
		
	
	%>
	<h1>Hello Name is :${name}</h1>
	<h1>Roll Number is :${roll}</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
		<h5>${item}</h5>
	</c:forEach>
</body>
</html>