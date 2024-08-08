<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="<c:url value='/resources/css/style.css'/>">
<script src="<c:url value='/resources/js/script.js'/>"></script>
</head>
<body>
	<h1>This is Home View from /home</h1>
	
	<form action="search">
		<input type="text" name="querybox" placeholder="Enter Your query">
		
		<button type="submit">Search</button>
	
	
	
	</form>
</body>
</html>