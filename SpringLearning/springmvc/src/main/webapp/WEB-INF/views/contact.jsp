<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<h5>${Header}</h5>
<br/>
		<form action="processform" method="post">
			Email: <input type="email" id="email" name="email"/>
			<br/>
			<br/>
			Passsword:<input type="password" id="password" name="password"/>
			
			<br/>
			<br/>
			<button type="submit">Sign Up</button>
		
		
		
		</form>
</body>
</html>